import java.util.HashMap;
import java.util.Map;

/**
 * TrainManagementApp.java
 * UC6: Map Bogie to Capacity using HashMap
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("==========================================");
        System.out.println();

        // 1. Initialize the HashMap
        // Key: String (Bogie Type), Value: Integer (Capacity)
        Map<String, Integer> bogieCapacities = new HashMap<>();

        // 2. Mapping Bogie Types to their specific capacities
        // put(key, value) stores the relationship
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("Cargo", 120);
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);

        // 3. Display the capacity details
        System.out.println("Bogie Capacity Details:");

        // Iterating through the map to print each key-value pair
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
        System.out.println("UC6 bogie-capacity mapping completed...");
    }
}