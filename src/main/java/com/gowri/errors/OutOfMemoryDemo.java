package com.gowri.errors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NaveenWodeyar
 * @date 08-May-2025 10:43:42 pm
 */

public class OutOfMemoryDemo {
    public static void main(String[] args) {
        List<int[]> memoryHog = new ArrayList<>();
        while (true) {
            memoryHog.add(new int[1000000]); // Allocate lots of memory
        }
    }
}
