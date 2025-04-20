package com.gowri.code;

/**
 * @author NaveenWodeyar
 * @date 19-Apr-2025 10:13:54 pm
 */

public class PalindromeNumber {

	static void palindromeNumber() {
		int num = 121;
		int original = num;
		int reversed = 0;

		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}

		if (original == reversed) {
			System.out.println(original + " is a palindrome.");
		} else {
			System.out.println(original + " is not a palindrome.");
		}
	}

	public static void main(String[] args) {

		// Get the Java runtime
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Run garbage collector

        // Record memory before execution
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        // Record time before
        long startTime = System.nanoTime();

        palindromeNumber();
        
        // Record time after
        long endTime = System.nanoTime();

        // Record memory after execution
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        // Calculate duration
        long durationNano = endTime - startTime;
        double durationMillis = durationNano / 1_000_000.0;

        // Calculate memory usage
        long memoryUsedBytes = memoryAfter - memoryBefore;
        double memoryUsedKB = memoryUsedBytes / 1024.0;

        // Output results
        System.out.println("\n======= Output =======");
        System.out.println("Time taken: " + durationNano + " ns (" + durationMillis + " ms)");
        System.out.println("Memory used: " + memoryUsedBytes + " bytes (" + memoryUsedKB + " KB)");

	}
}
