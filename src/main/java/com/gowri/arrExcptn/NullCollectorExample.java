package com.gowri.arrExcptn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 * @date 10-May-2025 6:56:16 pm
 */

public class NullCollectorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", null, "B");

        List<String> upperList = list.stream()
            .map(s -> s.toUpperCase()) // NPE here on null
            .collect(Collectors.toList());

        System.out.println(upperList);
    }
}

