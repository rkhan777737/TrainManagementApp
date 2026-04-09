import java.util.*;
import java.util.stream.Collectors;

/**
 * TrainManagementApp.java
 * UC9: Group Bogies by Type (Collectors.groupingBy)
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC9 - Group Bogies by Type (groupingBy)");
        System.out.println("==========================================");
        System.out.println();

        // 1. Initial Flat List of Bogies
        // We include duplicates of types to see the grouping in action
        List<String> bogieList = Arrays.asList(
                "Sleeper", "AC Chair", "Sleeper", "First Class", "AC Chair", "Sleeper"
        );

        System.out.println("Flat Bogie List (Before Grouping):");
        System.out.println(bogieList);
        System.out.println();

        // 2. Stream Pipeline: Grouping
        // This transforms List<String> into Map<String, List<String>>
        Map<String, List<String>> groupedBogies = bogieList.stream()
                .collect(Collectors.groupingBy(bogie -> bogie));

        // 3. Display Structured Grouping Result
        System.out.println("Grouped Bogie Formation:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " Count (" + list.size() + ") -> " + list);
        });

        // 4. Verification of Requirements
        System.out.println();
        System.out.println("Verification:");
        System.out.println("Original list integrity maintained. Size: " + bogieList.size());
        System.out.println("Total groups created: " + groupedBogies.size());

        System.out.println();
        System.out.println("UC9 formation setup completed...");
    }
}