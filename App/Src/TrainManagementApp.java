import java.util.*;
import java.util.stream.Collectors;

/**
 * TrainManagementApp.java
 * UC13: Performance Comparison (Loops vs Streams)
 */
public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   UC13 - Performance: Loops vs Streams");
        System.out.println("==========================================");
        System.out.println();

        // 1. Prepare a larger dataset for meaningful measurement
        List<Integer> bogieCapacities = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            bogieCapacities.add(random.nextInt(100)); // Capacity between 0-99
        }

        System.out.println("Processing " + bogieCapacities.size() + " bogies...");
        int threshold = 60;

        // 2. Benchmarking Traditional Loop
        long startLoop = System.nanoTime();
        List<Integer> filteredLoop = new ArrayList<>();
        for (Integer capacity : bogieCapacities) {
            if (capacity > threshold) {
                filteredLoop.add(capacity);
            }
        }
        long endLoop = System.nanoTime();
        long loopDuration = endLoop - startLoop;

        // 3. Benchmarking Java Stream
        long startStream = System.nanoTime();
        List<Integer> filteredStream = bogieCapacities.stream()
                .filter(c -> c > threshold)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        long streamDuration = endStream - startStream;

        // 4. Display Performance Results
        System.out.println("--- Execution Results ---");
        System.out.println("Loop Results Count   : " + filteredLoop.size());
        System.out.println("Stream Results Count : " + filteredStream.size());

        System.out.println("\n--- Performance Benchmarking ---");
        System.out.println("Loop Execution Time   : " + loopDuration + " ns");
        System.out.println("Stream Execution Time : " + streamDuration + " ns");

        // 5. Conclusion
        System.out.println("\nNote:");
        if (loopDuration < streamDuration) {
            System.out.println("Result: In this run, the Loop was faster by " + (streamDuration - loopDuration) + " ns.");
        } else {
            System.out.println("Result: In this run, the Stream was faster by " + (loopDuration - streamDuration) + " ns.");
        }

        System.out.println("\nUC13 comparison completed successfully...");
    }
}