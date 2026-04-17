public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC18 - Linear Search for Bogie ID");
        System.out.println("==========================================");
        System.out.println();

        // 1. Setup: Unsorted list of Bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // 2. Define the Search Keys (Test Cases)
        String searchKeyFound = "BG309";
        String searchKeyNotFound = "BG999";

        // 3. Perform Linear Search
        performLinearSearch(bogieIds, searchKeyFound);
        performLinearSearch(bogieIds, searchKeyNotFound);

        System.out.println();
        System.out.println("UC18 search operations completed successfully...");
    }

    /**
     * Logic for Linear Search
     */
    public static void performLinearSearch(String[] arr, String key) {
        boolean found = false;
        int position = -1;

        System.out.println("Searching for Bogie ID: " + key + "...");

        // Sequential Traversal: Check each element one by one
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                found = true;
                position = i;
                break; // Early Termination: Stop as soon as we find it
            }
        }

        // 4. Display Results
        if (found) {
            System.out.println("SUCCESS: Bogie " + key + " found at index " + position + ".");
        } else {
            System.out.println("FAILED: Bogie " + key + " was not found in the consist.");
        }
    }
}