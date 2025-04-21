package com.gowri.code;

import java.util.*;

/**
 * @author
 */

public class SubstringMatch {

    static boolean containsString(String target) {
        List<String> strList = Arrays.asList("One", "Two2", "Three3", "4Four");

        long startTime = System.nanoTime();
        long startMemory = getUsedMemory();

        boolean found = false;
        for (String str : strList) {
            if (str.contains(target)) {
                found = true;
                break;
            }
        }

        long endTime = System.nanoTime();
        long endMemory = getUsedMemory();

        System.out.println("containsString() => Time: " + (endTime - startTime) + " ns");
        System.out.println("containsString() => Memory: " + (endMemory - startMemory) + " bytes");
        System.out.println(found ? "Yes" : "No");

        return found;
    }

    static boolean containsStringJava8(String target) {
        List<String> strList = Arrays.asList("One", "Two2", "Three3", "4Four");

        long startTime = System.nanoTime();
        long startMemory = getUsedMemory();

        boolean result = strList.stream().anyMatch(s -> s.contains(target));

        long endTime = System.nanoTime();
        long endMemory = getUsedMemory();

        System.out.println("containsStringJava8() => Time: " + (endTime - startTime) + " ns");
        System.out.println("containsStringJava8() => Memory: " + (endMemory - startMemory) + " bytes");
        System.out.println(result ? "Yes" : "No");

        return result;
    }

    private static long getUsedMemory() {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Run garbage collector for accurate measurement
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static void main(String[] args) {
        containsString("Two");
        containsStringJava8("Two");
    }
}
