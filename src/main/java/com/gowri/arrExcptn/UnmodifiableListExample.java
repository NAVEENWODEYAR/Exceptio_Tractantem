package com.gowri.arrExcptn;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 * @date 10-May-2025 6:57:11 pm
 */

public class UnmodifiableListExample {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three");

        List<String> collected = list.stream()
            .collect(Collectors.collectingAndThen(
                Collectors.toList(),
                List::copyOf // returns unmodifiable list
            ));

        collected.add("four"); // Throws UnsupportedOperationException
    }
}
