package com.gowri.arrExcptn;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 * @date 10-May-2025 6:57:51 pm
 */

public class ClassCastExample {
    public static void main(String[] args) {
        List<Object> list = List.of("A", 1, "B");

        Set<String> set = list.stream()
            .map(obj -> (String) obj) // ClassCastException for Integer
            .collect(Collectors.toSet());
    }
}

