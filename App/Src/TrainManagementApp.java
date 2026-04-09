import java.util.*;

/**
 * TrainManagementApp.java
 * UC12: Safety Compliance Check for Goods Bogies
 */
public class TrainManagementApp {

    // Simple helper class to represent a Goods Bogie
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC12 - Safety Compliance Check");
        System.out.println("==========================================");
        System.out.println();

        // 1. Prepare a list of Goods Bogies
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Rectangular", "Coal"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Rectangular", "Grain"));

        // 2. Define the Safety Rule using a Stream
        // Rule: IF type is Cylindrical, THEN cargo MUST BE Petroleum.
        // allMatch returns true only if EVERY bogie satisfies this condition.
        boolean isSafe = goodsConsist.stream().allMatch(bogie -> {
            if (bogie.type.equals("Cylindrical")) {
                return bogie.cargo.equals("Petroleum");
            }
            return true; // Non-cylindrical bogies are safe by default here
        });

        // 3. Display Results
        System.out.println("Analyzing " + goodsConsist.size() + " goods bogies...");
        System.out.println("Safety Compliance Status: " + (isSafe ? "PASS" : "FAIL"));

        if (isSafe) {
            System.out.println("Status: All cylindrical bogies are carrying safe cargo.");
        } else {
            System.out.println("ALERT: Safety violation detected! Check cargo assignments.");
        }

        // 4. Test Case: Invalid Formation
        System.out.println("\n--- Testing Invalid Formation ---");
        List<GoodsBogie> unsafeConsist = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Cylindrical", "Coal") // VIOLATION!
        );

        boolean secondCheck = unsafeConsist.stream().allMatch(b ->
                !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
        );

        System.out.println("Unsafe Consist Result: " + (secondCheck ? "PASS" : "FAIL"));
        System.out.println();
        System.out.println("UC12 safety check completed successfully...");
    }
}