package com.gowri.system.design;

/**
 * 
 * @author NaveenWodeyar
 * @date 08-Oct-2026 11:58:35 pm
 * 
 * Demonstrates latency.
 *
 * <p>Latency is the time required to complete a single operation.
 *
 * <p>Example:
 * An API that responds in 50 ms has lower latency than
 * an API that responds in 500 ms.
 *
 * <p>Why it matters:
 * Lower latency generally gives users a faster and more
 * responsive experience.
 */
public class LatencyExample {

    public static void main(String[] args) {
        long start = System.nanoTime();

        performTask();

        long elapsed = System.nanoTime() - start;

        System.out.println("Latency: " + elapsed + " ns");
    }

    /**
     * Simulates an operation whose execution time we want to measure.
     */
    private static void performTask() {
        for (int i = 0; i < 1_000_000; i++) {
            Math.sqrt(i);
        }
    }
}