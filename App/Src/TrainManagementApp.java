import java.util.*;

/**
 * TrainManagementApp.java
 * UC7: Sort Bogies by Capacity using Comparator
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("==========================================");
        System.out.println();

        // 1. Initialize Map with data
        Map<String, Integer> bogieCapacities = new LinkedHashMap<>();
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("General", 90);

        System.out.println("Before Sorting:");
        bogieCapacities.forEach((k, v) -> System.out.println(k + " -> " + v));
        System.out.println();

        // 2. Convert Map entries to a List for sorting
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(bogieCapacities.entrySet());

        // 3. Sort the list using a Comparator
        // We compare the 'Value' (Integer capacity) of each entry
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        });

        // 4. Display sorted results
        System.out.println("After Sorting by Capacity:");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
        System.out.println("UC7 sorting completed...");
    }
}