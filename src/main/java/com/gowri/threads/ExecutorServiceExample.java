package com.gowri.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author NaveenWodeyar
 * @date 21-Mar-2025 7:32:21 pm
 */

public class ExecutorServiceExample {
	
    public static void main(String[] args) {
        // Creating a fixed thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        // Creating tasks (Runnable)
        Runnable task1 = () -> {
            System.out.println(Thread.currentThread().getName() + " - Task 1 is running");
        };
        Runnable task2 = () -> {
            System.out.println(Thread.currentThread().getName() + " - Task 2 is running");
        };
        Runnable task3 = () -> {
            System.out.println(Thread.currentThread().getName() + " - Task 3 is running");
        };

        // Submitting tasks to the executor
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        // Shutting down the executor
        executorService.shutdown();
    }
}
