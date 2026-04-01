import java.util.HashSet;
import java.util.Set;

/**
 * TrainManagementApp.java
 * UC3: Track Unique Bogie IDs using HashSet
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("      UC3 - Track Unique Bogie IDs");
        System.out.println("==========================================");
        System.out.println();

        // 1. Initialize a Set for Unique Bogie IDs
        // HashSet is chosen because it automatically handles uniqueness validation.
        Set<String> bogieIDs = new HashSet<>();

        // 2. Inserting IDs (including a duplicate to test validation)
        bogieIDs.add("BG101");
        bogieIDs.add("矢BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG104");

        // Attempting to add a duplicate ID
        bogieIDs.add("BG101");

        // 3. Display IDs after insertion
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIDs);
        System.out.println();

        // 4. Important Note on Set Behavior
        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        System.out.println();

        System.out.println("UC3 uniqueness validation completed...");
    }
}