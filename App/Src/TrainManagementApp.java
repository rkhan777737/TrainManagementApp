import java.util.*;
import java.util.stream.Collectors;

/**
 * CUSTOM EXCEPTIONS (Domain Rules)
 */
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

/**
 * BOGIE MODELS
 */
class GoodsBogie {
    String shape;
    String assignedCargo = "None";

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {
        try {
            // Safety Rule: Cylindrical bogies only for Petroleum
            if (cargo.equalsIgnoreCase("Petroleum") && !shape.equalsIgnoreCase("Cylindrical")) {
                throw new CargoSafetyException("SAFETY ALERT: Petroleum requires a Cylindrical bogie!");
            }
            this.assignedCargo = cargo;
            System.out.println("Success: [" + cargo + "] assigned to [" + shape + "] bogie.");
        } catch (CargoSafetyException e) {
            System.out.println("Handled Exception: " + e.getMessage());
        } finally {
            System.out.println("Status: Cargo safety validation complete.");
        }
    }
}

/**
 * MAIN APPLICATION CLASS
 * The filename must match this class name exactly.
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   Train Consist Management App - UC15");
        System.out.println("==========================================");
        System.out.println();

        // 1. DATA INITIALIZATION (Using Map for capacities)
        Map<String, Integer> bogieCapacities = new LinkedHashMap<>();
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("General", 90);

        // 2. STREAM AGGREGATION (UC10)
        int totalSeats = bogieCapacities.values().stream()
                .reduce(0, Integer::sum);
        System.out.println("Total Train Seating Capacity: " + totalSeats);
        System.out.println();

        // 3. CUSTOM EXCEPTION & FAIL-FAST (UC14)
        System.out.println("--- Validating Passenger Bogie Creation ---");
        try {
            System.out.println("Creating bogie with -10 capacity...");
            // This will throw InvalidCapacityException
            if ( -10 <= 0 ) throw new InvalidCapacityException("Capacity must be greater than zero");
        } catch (InvalidCapacityException e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }
        System.out.println();

        // 4. STRUCTURED ERROR HANDLING (UC15)
        System.out.println("--- Testing Cargo Safety Assignments ---");
        GoodsBogie g1 = new GoodsBogie("Rectangular");
        g1.assignCargo("Petroleum"); // Unsafe assignment

        System.out.println();

        GoodsBogie g2 = new GoodsBogie("Cylindrical");
        g2.assignCargo("Petroleum"); // Safe assignment

        System.out.println();
        System.out.println("==========================================");
        System.out.println("   Application execution completed safely.");
        System.out.println("==========================================");
    }
}