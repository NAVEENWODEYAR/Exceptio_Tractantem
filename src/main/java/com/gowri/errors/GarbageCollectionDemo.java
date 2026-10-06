package com.gowri.errors;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author NaveenWodeyar
 * @date 05-Oct-2026 10:53:50 pm
 * Demonstrates how garbage collection can help prevent
 * excessive heap memory usage in Java.
 *
 * The program continuously creates byte arrays and periodically
 * removes their references so that the Garbage Collector can
 * reclaim the unused heap memory.
 *
 * @author Demo
 */
public class GarbageCollectionDemo {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // List used to temporarily hold the allocated objects.
        List<byte[]> memory = new ArrayList<>();

        // Allocate memory in multiple iterations.
        for (int i = 1; i <= 100; i++) {

            // Allocate approximately 1 MB of heap memory.
            byte[] data = new byte[1024 * 1024];

            // Keep a reference to the object in the list.
            memory.add(data);

            System.out.println("Allocated: " + i + " MB");

            /*
             * Every 10 iterations, remove all references from the list.
             * The objects are now eligible for garbage collection.
             */
            if (i % 10 == 0) {

                // Remove references to the allocated objects.
                memory.clear();

                // Request the JVM to perform garbage collection.
                // Note: System.gc() is only a request, not a guarantee.
                System.gc();

                System.out.println(
                    "Garbage collection requested after "
                    + i + " MB allocation."
                );
            }
        }

        // The program completes without continuously consuming heap memory.
        System.out.println("Program completed successfully.");
    }
}
