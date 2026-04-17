import java.util.Arrays;

public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC19 - Binary Search (Optimized)");
        System.out.println("==========================================");
        System.out.println();

        // 1. Precondition: Data MUST be sorted
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        System.out.println("Original Data (Unsorted): " + Arrays.toString(bogieIds));

        Arrays.sort(bogieIds);
        System.out.println("Sorted Data (Requirement): " + Arrays.toString(bogieIds));
        System.out.println();

        // 2. Test Cases
        String searchFound = "BG309";
        String searchNotFound = "BG999";

        // 3. Perform Binary Search
        performBinarySearch(bogieIds, searchFound);
        performBinarySearch(bogieIds, searchNotFound);

        System.out.println();
        System.out.println("UC19 optimized search completed successfully...");
    }

    /**
     * Optimized Binary Search Logic
     */
    public static void performBinarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;
        int foundIndex = -1;

        System.out.println("Binary Searching for: " + key);

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate middle index

            // Compare string lexicographically
            int comparison = key.compareTo(arr[mid]);

            if (comparison == 0) {
                foundIndex = mid;
                break; // Found!
            } else if (comparison > 0) {
                low = mid + 1; // Search the right half
            } else {
                high = mid - 1; // Search the left half
            }
        }

        if (foundIndex != -1) {
            System.out.println("RESULT: Bogie " + key + " found at sorted index " + foundIndex);
        } else {
            System.out.println("RESULT: Bogie " + key + " not found in the system.");
        }
    }
}