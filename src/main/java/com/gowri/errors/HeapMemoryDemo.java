package com.gowri.errors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NaveenWodeyar
 * @date 05-Oct-2026 10:45:36 pm
 */

public class HeapMemoryDemo {

    public static void main(String[] args) {

        // Stores the allocated memory and prevents garbage collection.
        List<byte[]> memory = new ArrayList<>();

        // Continuously allocate 1 MB of heap memory.
        while (true) {
            byte[] data = new byte[1024 * 1024];
            memory.add(data);

            System.out.println("Allocated: " + memory.size() + " MB");
        }
    }
}