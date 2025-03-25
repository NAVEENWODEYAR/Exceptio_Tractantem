package com.gowri.threads;

/**
 * @author NaveenWodeyar
 * @date 25-Mar-2025 10:31:29 pm
 */

public class SequentialExecution {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Task 1 (2 seconds)
        try {
            System.out.println("Task 1 started");
            Thread.sleep(2000); // Simulating 2 seconds task
            System.out.println("Task 1 completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Task 2 (1 second)
        try {
            System.out.println("Task 2 started");
            Thread.sleep(1000); // Simulating 1 second task
            System.out.println("Task 2 completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time without threads: " + (endTime - startTime) + " ms");
    }
}
