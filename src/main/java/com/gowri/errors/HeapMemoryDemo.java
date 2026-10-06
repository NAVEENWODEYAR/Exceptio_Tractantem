package com.gowri.errors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NaveenWodeyar
 * @date 05-Oct-2026 10:45:36 pm
 */
public class HeapMemoryDemo {

    public static void main(String[] args) {

        List<byte[]> memory = new ArrayList<>();

        Runtime runtime = Runtime.getRuntime();

        final long ONE_MB = 1024 * 1024;

        while (true) {

            // Calculate heap memory before allocation
            long totalHeap = runtime.totalMemory();
            long freeHeap = runtime.freeMemory();
            long usedHeap = totalHeap - freeHeap;
            long maxHeap = runtime.maxMemory();

            // Log heap information
            System.out.printf(
                    "Heap Used: %.2f MB | " +
                    "Heap Total: %.2f MB | " +
                    "Heap Free: %.2f MB | " +
                    "Heap Max: %.2f MB%n",

                    toMB(usedHeap),
                    toMB(totalHeap),
                    toMB(freeHeap),
                    toMB(maxHeap)
            );

            // Check whether another 1 MB can be allocated
            if (usedHeap + ONE_MB > maxHeap) {

                System.out.println(
                        "Maximum heap limit reached. Stopping allocation."
                );

                break;
            }

            // Allocate 1 MB
            byte[] data = new byte[(int) ONE_MB];

            // Keep reference so GC cannot reclaim it
            memory.add(data);

            System.out.println(
                    "Allocated: " + memory.size() + " MB"
            );
        }
    }

    private static double toMB(long bytes) {
        return bytes / (1024.0 * 1024.0);
    }
}