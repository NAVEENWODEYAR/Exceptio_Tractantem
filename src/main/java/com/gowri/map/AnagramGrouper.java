package com.gowri.map;

import java.util.*;
/**
 * @author NaveenWodeyar
 * @date 19-Nov-2026 10:55:02 pm
 */

public class AnagramGrouper {

    public static void main(String[] args) {

        String[] words = {
            "eat", "tea", "tan", "ate", "nat", "bat"
        };

        Map<String, List<String>> anagramGroups =
                new HashMap<>();

        for (String word : words) {

            char[] characters = word.toCharArray();

            Arrays.sort(characters);

            String sortedWord = new String(characters);

            anagramGroups
                .computeIfAbsent(
                    sortedWord,
                    key -> new ArrayList<>()
                )
                .add(word);
        }

        for (List<String> group : anagramGroups.values()) {
            System.out.println(group);
        }
    }
}
