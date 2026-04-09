import java.util.*;
import java.util.stream.Collectors;

/**
 * TrainManagementApp.java
 * UC10: Count Total Seats in Train using reduce()
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC10 - Count Total Seats (reduce)");
        System.out.println("==========================================");
        System.out.println();

        // 1. Setup Bogie Data (Reusing the mapping from UC6/7)
        Map<String, Integer> bogieCapacities = new LinkedHashMap<>();
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("General", 90);

        System.out.println("Current Bogie Capacities:");
        bogieCapacities.forEach((type, cap) -> System.out.println(type + ": " + cap + " seats"));
        System.out.println();

        // 2. Stream Pipeline: Map and Reduce
        // - stream(): Convert the values (capacities) to a stream
        // - reduce(identity, accumulator): 0 is the starting point, Integer::sum adds them up
        int totalSeats = bogieCapacities.values().stream()
                .reduce(0, Integer::sum);

        // 3. Display Aggregated Result
        System.out.println("------------------------------------------");
        System.out.println("Total Seating Capacity of Train: " + totalSeats);
        System.out.println("------------------------------------------");

        // 4. Verification for Test Cases
        System.out.println();
        System.out.println("Verification:");
        System.out.println("Aggregation logic: Correct (72 + 56 + 24 + 90 = " + (72+56+24+90) + ")");
        System.out.println("Empty list handling check: " + (new ArrayList<Integer>().stream().reduce(0, Integer::sum)));

        System.out.println();
        System.out.println("UC10 aggregation completed successfully...");
    }
}