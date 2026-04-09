import java.util.*;
import java.util.stream.Collectors;

/**
 * TrainManagementApp.java
 * UC8: Filter Passenger Bogies Using Streams
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("=============s=============================");
        System.out.println("   UC8 - Filter Passenger Bogies (Streams)");
        System.out.println("==========================================");
        System.out.println();

        // 1. Initial Bogie Data (Reusing types from UC7)
        Map<String, Integer> bogieMap = new HashMap<>();
        bogieMap.put("Sleeper", 72);
        bogieMap.put("AC Chair", 56);
        bogieMap.put("First Class", 24);
        bogieMap.put("General", 90);

        System.out.println("Original Bogie List:");
        bogieMap.forEach((name, cap) -> System.out.println(name + " (Capacity: " + cap + ")"));
        System.out.println();

        // 2. Stream Pipeline: Filter and Collect
        // We filter for high-capacity bogies (Capacity > 60)
        int threshold = 60;
        List<String> highCapacityBogies = bogieMap.entrySet().stream()
                .filter(entry -> entry.getValue() > threshold) // The condition (Lambda)
                .map(Map.Entry::getKey)                       // Transform entry to just the name
                .collect(Collectors.toList());                // Terminate and store in a new list

        // 3. Display Results
        System.out.println("Filtering Bogies with Capacity > " + threshold + "...");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            System.out.println("High-Capacity Bogies: " + highCapacityBogies);
        }

        // 4. Verify Integrity
        System.out.println();
        System.out.println("Verification:");
        System.out.println("Original list count: " + bogieMap.size());
        System.out.println("UC8 filtering operations completed successfully...");
    }
}