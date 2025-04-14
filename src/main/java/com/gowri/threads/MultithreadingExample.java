package com.gowri.threads;

/**
 * @author NaveenWodeyar
 * @date 14-Apr-2025 10:19:02 pm
 */

public class MultithreadingExample {
	 public static void main(String[] args) {
	        // Get memory before threads start
	        Runtime runtime = Runtime.getRuntime();
	        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();

	        // Create thread objects
	        PrintNumbers thread1 = new PrintNumbers();
	        PrintLetters thread2 = new PrintLetters();

	        // Start the threads
	        thread1.start();
	        thread2.start();

	        try {
	            // Wait for both threads to finish
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }

	        // Get memory after threads finish
	        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

	        // Calculate memory used
	        long memoryUsed = afterMemory - beforeMemory;

	        // Print the time and memory consumed by each thread
	        System.out.println("Time taken by thread1 (PrintNumbers): " + thread1.getTimeTaken() / 1_000_000 + " ms");
	        System.out.println("Time taken by thread2 (PrintLetters): " + thread2.getTimeTaken() / 1_000_000 + " ms");

	        System.out.println("Total memory used by both threads: " + memoryUsed + " bytes");
	    }
}
