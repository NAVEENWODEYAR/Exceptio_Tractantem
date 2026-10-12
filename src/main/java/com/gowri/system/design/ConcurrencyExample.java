package com.gowri.system.design;

/**
 * 
 * @author NaveenWodeyar
 * @date 09-Oct-2026 12:42:29 am
 * 
 * Demonstrates concurrency.
 *
 * <p>Concurrency means multiple tasks are in progress
 * during the same period.
 *
 * <p>Concurrency does not necessarily mean that tasks execute
 * at exactly the same instant.
 *
 * <p>Why it matters:
 * Concurrency allows applications to handle many tasks,
 * requests, or users efficiently.
 */
public class ConcurrencyExample {

    public static void main(String[] args)
            throws InterruptedException {

        Thread task1 = new Thread(() -> work("Task 1"));
        Thread task2 = new Thread(() -> work("Task 2"));

        task1.start();
        task2.start();

        // Wait until both tasks finish.
        task1.join();
        task2.join();

        System.out.println("All tasks completed.");
    }

    /**
     * Simulates work performed by a concurrent task.
     */
    private static void work(String taskName) {
        System.out.println(taskName + " started.");

        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(taskName + " completed.");
    }
}