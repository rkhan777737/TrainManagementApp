import java.util.ArrayList;
import java.util.List;

/**
 * TrainManagementApp.java
 * UC2: Add Passenger Bogies to Train
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        // --- UC1 Logic (Initialization) ---
        List<String> passengerBogies = new ArrayList<>();

        // --- UC2 Logic (Operations) ---
        System.out.println("==========================================");
        System.out.println("  UC2 - Add Passenger Bogies to Train");
        System.out.println("==========================================");
        System.out.println();

        // 1. Adding Bogies
        // The add() method appends elements to the end of the list
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);
        System.out.println();

        // 2. Removing a Bogie
        // The remove() method finds the first occurrence of the object and deletes it
        passengerBogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);
        System.out.println();

        // 3. Checking for existence
        // The contains() method returns a boolean (true/false)
        System.out.println("Checking if 'Sleeper' exists:");
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + hasSleeper);
        System.out.println();

        // 4. Final Summary
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies);
        System.out.println();
        System.out.println("UC2 operations completed successfully...");
    }
}