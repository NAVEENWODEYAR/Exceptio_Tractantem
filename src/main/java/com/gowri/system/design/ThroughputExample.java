package com.gowri.system.design;

/**
 * @author NaveenWodeyar
 * @date 09-Oct-2026 12:29:08 am
 *
 * Demonstrates throughput.
 *
 * <p>Throughput is the amount of work a system completes
 * during a given period.
 *
 * <p>It is commonly measured as requests/second,
 * transactions/second, or messages/second.
 *
 * <p>Why it matters:
 * Throughput tells us how much workload a system can process.
 */
public class ThroughputExample {

    public static void main(String[] args) {
    	
        int totalTasks = 1_000_000;
        long start = System.nanoTime();

        for (int i = 0; i < totalTasks; i++) {
            processTask();
        }

        long elapsed = System.nanoTime() - start;
        double seconds = elapsed / 1_000_000_000.0;

        double throughput = totalTasks / seconds;

        System.out.printf(
                "Throughput: %.2f tasks/sec%n",
                throughput
        );
    }

    /**
     * Simulates processing one unit of work.
     */
    private static void processTask() {
        Math.sqrt(100);
    }
}