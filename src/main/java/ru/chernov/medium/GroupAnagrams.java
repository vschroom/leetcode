package ru.chernov.medium;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupAnagramMap = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if (groupAnagramMap.containsKey(sortedStr)) {
                groupAnagramMap.get(sortedStr).add(str);
            } else {
                ArrayList<String> values = new ArrayList<>();
                values.add(str);
                groupAnagramMap.put(sortedStr, values);
            }
        }

        return new ArrayList<>(groupAnagramMap.values());
    }
}
