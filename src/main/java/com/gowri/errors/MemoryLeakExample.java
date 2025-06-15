package com.gowri.errors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NaveenWodeyar
 * @date 15-Jun-2025 8:59:17 pm
 */

public class MemoryLeakExample {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        try {
            while (true) {
                // Continuously allocate 1MB arrays
                list.add(new int[256 * 1024]); // Roughly 1MB (256K ints)
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError during object creation!");
        }

        System.out.println("Program continues after memory exhaustion.");
    }
}
