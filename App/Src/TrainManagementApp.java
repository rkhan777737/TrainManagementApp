import java.util.Arrays;

/**
 * TrainManagementApp.java
 * UC20: Defensive Programming - State Validation
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC20 - Defensive Search Validation");
        System.out.println("==========================================");
        System.out.println();

        // 1. Scenario: Empty Train Consist
        String[] emptyConsist = {};

        // 2. Scenario: Valid Train Consist
        String[] validConsist = {"BG101", "BG205", "BG309"};

        // TEST 1: Attempt to search an empty consist
        System.out.println("TEST 1: Searching on an EMPTY train...");
        try {
            validatedSearch(emptyConsist, "BG101");
        } catch (IllegalStateException e) {
            System.err.println("CRITICAL ERROR: " + e.getMessage());
        }

        System.out.println();

        // TEST 2: Attempt to search a valid consist
        System.out.println("TEST 2: Searching on a VALID train...");
        try {
            validatedSearch(validConsist, "BG205");
        } catch (IllegalStateException e) {
            System.err.println("ERROR: " + e.getMessage());
        }

        System.out.println();
        System.out.println("UC20 defensive operations completed successfully...");
    }

    /**
     * Search method with State Validation
     */
    public static void validatedSearch(String[] arr, String key) {
        // DEFENSIVE STEP: State Validation
        // If the train is empty, it's illegal to even attempt a search
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Search Failed: No bogies found in the train formation.");
        }

        // Standard Search Logic (Linear)
        boolean found = false;
        for (String bogie : arr) {
            if (bogie.equals(key)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("SUCCESS: Bogie [" + key + "] located in the consist.");
        } else {
            System.out.println("RESULT: Bogie [" + key + "] not found in the current formation.");
        }
    }
}