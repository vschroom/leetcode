package ru.chernov.algthms.hashmap.eazy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Given an array of integers arr,
 * return true if the number of occurrences of each value in the array is unique or false otherwise.
 */
public class UniqueNumberOfOccurrences {

    private final Map<Integer, Integer> map = new HashMap<>();

    public boolean uniqueOccurrences(int[] arr) {
        for (int num : arr) {
            int cnt = map.getOrDefault(num, 0);
            map.put(num, ++cnt);
        }

        return new HashSet<>(map.values()).size() == map.size();
    }
}
