import java.util.Arrays;

/**
 * TrainManagementApp.java
 * UC16: Manual Sorting using Bubble Sort Algorithm
 */
public class TrainManagementApp{

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC16 - Manual Sorting (Bubble Sort)");
        System.out.println("==========================================");
        System.out.println();

        // 1. Array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Capacities Before Sorting:");
        System.out.println(Arrays.toString(capacities));
        System.out.println();

        // 2. Bubble Sort Algorithm
        // Outer loop: Controls the number of passes
        for (int i = 0; i < capacities.length - 1; i++) {

            // Inner loop: Performs adjacent comparisons
            for (int j = 0; j < capacities.length - 1 - i; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {
                    // SWAP logic: Use a temporary variable to switch positions
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // 3. Display Sorted Result
        System.out.println("Capacities After Bubble Sort (Ascending):");
        System.out.println(Arrays.toString(capacities));

        System.out.println();
        System.out.println("UC16 algorithmic sorting completed successfully...");
    }
}