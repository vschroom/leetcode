package ru.chernov.algthms.hashmap.eazy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * You are given an array of strings names, and an array heights that consists of distinct positive integers.
 * Both arrays are of length n.
 * For each index i, names[i] and heights[i] denote the name and height of the ith person.
 * Return names sorted in descending order by the people's heights.
 */
public class SortThePeople {

    private final Map<Integer, String> map = new HashMap<>();

    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        var res = new String[names.length];
        for (int i = heights.length - 1, j = 0; i >= 0; i--, j++) {
            res[j] = map.get(heights[i]);
        }

        return res;
    }

    public String[] sortPeople2(String[] names, int[] heights) {
        int[] store = new int[100000 + 1];
        for (int i = 0; i < names.length; i++) {
            store[heights[i]] = i;
        }

        Arrays.sort(heights);

        var res = new String[names.length];
        for (int i = heights.length - 1, j = 0; i >= 0; i--, j++) {
            res[j] = names[store[heights[i]]];
        }

        return res;
    }
}
