/**
 * 1. Custom Exception Class
 * Extends Exception to create a 'Checked Exception'
 */
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

/**
 * 2. PassengerBogie Class with validation
 */
class PassengerBogie {
    private String type;
    private int capacity;

    // The constructor 'throws' the exception to the caller
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            // Business Rule: Capacity must be a positive integer
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " (" + capacity + " seats)";
    }
}

/**
 * UC14: Handle Invalid Bogie Capacity (Custom Exception)
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC14 - Handle Invalid Bogie Capacity");
        System.out.println("==========================================");
        System.out.println();

        // Testing Case 1: Valid Capacity
        try {
            System.out.println("Attempting to create a valid bogie...");
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.println("Successfully created: " + sleeper);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Testing Case 2: Zero Capacity (Invalid)
        try {
            System.out.println("Attempting to create a bogie with 0 capacity...");
            PassengerBogie brokenBogie = new PassengerBogie("General", 0);
        } catch (InvalidCapacityException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println();

        // Testing Case 3: Negative Capacity (Invalid)
        try {
            System.out.println("Attempting to create a bogie with -10 capacity...");
            PassengerBogie invalidBogie = new PassengerBogie("AC Chair", -10);
        } catch (InvalidCapacityException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println();
        System.out.println("UC14 exception handling completed safely...");
    }
}