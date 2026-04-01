import java.util.ArrayList;
import java.util.List;

/**
 * TrainManagementApp.java
 * UC1: Initialize Train and Display Consist Summary
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        // 1. Welcome Message & Branding
        System.out.println("==========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==========================================");
        System.out.println();

        // 2. Dynamic Collection Initialization
        // We initialize an empty List to hold our train's consist.
        // The ArrayList allows the consist to grow as bogies are added later.
        List<String> trainConsist = new ArrayList<>();

        // 3. Display Initial State
        System.out.println("Train initialized successfully...");

        // size() returns 0 since no bogies have been added yet
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Printing the list object directly shows the empty brackets []
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println();
        System.out.println("System ready for operations...");
    }
}