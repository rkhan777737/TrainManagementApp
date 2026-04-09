import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TrainManagementApp.java
 * UC11: Validate Train ID & Cargo Codes using Regex
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC11 - Validate Train ID & Cargo Codes");
        System.out.println("==========================================");
        System.out.println();

        // 1. Define Regex Patterns
        // TRN- followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // PET- followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Compile Patterns
        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        // 3. Test Cases (Sample Inputs)
        String[] testTrainIds = {"TRN-1234", "TRAIN12", "TRN-123", "TRN-12345"};
        String[] testCargoCodes = {"PET-AB", "PET-ab", "PET123", "PET-XY"};

        // 4. Validate Train IDs
        System.out.println("--- Train ID Validation ---");
        for (String id : testTrainIds) {
            Matcher matcher = trainIdPattern.matcher(id);
            System.out.println("Input: " + id + " -> Valid: " + matcher.matches());
        }
        System.out.println();

        // 5. Validate Cargo Codes
        System.out.println("--- Cargo Code Validation ---");
        for (String code : testCargoCodes) {
            Matcher matcher = cargoCodePattern.matcher(code);
            System.out.println("Input: " + code + " -> Valid: " + matcher.matches());
        }

        System.out.println();
        System.out.println("UC11 validation logic completed successfully...");
    }
}