import java.util.LinkedHashSet;
import java.util.Set;

/**
 * TrainManagementApp.java
 * UC5: Preserve Insertion Order of Bogies using LinkedHashSet
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC5 - Preserve Insertion Order of Bogies");
        System.out.println("==========================================");
        System.out.println();

        // 1. Initialize the formation using LinkedHashSet
        // This collection maintains a doubly-linked list running through its items
        // to preserve the order of insertion.
        Set<String> formation = new LinkedHashSet<>();

        // 2. Attaching bogies in a specific sequence
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // 3. Attempting to attach a duplicate bogie
        // The LinkedHashSet will recognize "Sleeper" is already present and ignore it.
        formation.add("Sleeper");

        // 4. Display the Final Train Formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);
        System.out.println();

        // 5. Note on behavior
        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println();

        System.out.println("UC5 formation setup completed...");
    }
}