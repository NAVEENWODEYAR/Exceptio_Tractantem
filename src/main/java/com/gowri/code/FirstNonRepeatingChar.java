package com.gowri.code;

/**
 * @author NaveenWodeyar
 * @date 19-Apr-2025 10:14:41 pm
 */

public class FirstNonRepeatingChar {

	static void firstNonRepeatingCharacter(String str) {
		boolean found = false;

		for (char ch : str.toCharArray()) {
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println("First non-repeating character: " + ch);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No non-repeating characters found.");
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

		String str = "FirstNonRepeatingChar";
		firstNonRepeatingCharacter(str);

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
