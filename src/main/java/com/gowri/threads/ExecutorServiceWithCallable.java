package com.gowri.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author NaveenWodeyar
 * @date 21-Mar-2025 7:33:39 pm
 */

public class ExecutorServiceWithCallable {
    public static void main(String[] args) {
        // Creating a fixed thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Creating a callable task
        Callable<Integer> task1 = () -> {
            System.out.println(Thread.currentThread().getName() + " - Task 1 is running");
            Thread.sleep(1000); // Simulating some computation
            return 1 + 2;
        };
        
        // Submitting the task and getting a Future object
        Future<Integer> result = executorService.submit(task1);

        try {
            // Waiting for the result of the task
            Integer resultValue = result.get(); // This blocks until the result is available
            System.out.println("Task 1 result: " + resultValue);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Shutting down the executor
        executorService.shutdown();
    }
}

