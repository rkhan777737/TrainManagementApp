import java.util.Arrays;

/**
 * TrainManagementApp.java
 * UC17: Sorting Bogie Names Using built-in Arrays.sort()
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC17 - Alphabetical Sorting (Arrays.sort)");
        System.out.println("==========================================");
        System.out.println();

        // 1. Input: Array of bogie type names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Bogie Names Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));
        System.out.println();

        // 2. Built-in Sorting
        // This replaces the nested loops and manual swap logic from UC16
        Arrays.sort(bogieNames);

        // 3. Output: Display sorted array
        System.out.println("Bogie Names After Arrays.sort() (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println();
        System.out.println("UC17 optimized sorting completed successfully...");
    }
}