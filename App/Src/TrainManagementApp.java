import java.util.LinkedList;

/**
 * TrainManagementApp.java
 * UC4: Maintain Ordered Bogie Consist using LinkedList
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC4 - Maintain Ordered Bogie Consist");
        System.out.println("==========================================");
        System.out.println();

        // 1. Initialize the consist using LinkedList
        // LinkedList is ideal for sequential operations like a train line.
        LinkedList<String> consist = new LinkedList<>();

        // 2. Setting the initial consist
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(consist);
        System.out.println();

        // 3. Inserting at a specific position (Index 2)
        // Remember: Java lists use 0-based indexing.
        // Position 2 means it will become the 3rd element.
        consist.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(consist);
        System.out.println();

        // 4. Removing First and Last Bogies
        // LinkedList provides specific methods for ends of the list
        consist.removeFirst(); // Removes Engine
        consist.removeLast();  // Removes Guard

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(consist);
        System.out.println();

        System.out.println("UC4 ordered consist operations completed...");
    }
}