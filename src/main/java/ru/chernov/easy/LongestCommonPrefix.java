package ru.chernov.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    @SuppressWarnings("java:S127")
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        var shortest = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(shortest)) {
                shortest = shortest.substring(0, shortest.length() - 1);
                i = 0;
            }
        }

        return shortest;
    }

    public String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        var shortest = strs[0];
        var last = strs[strs.length - 1];
        var i = 0;
        while (shortest.length() > i) {
            if (shortest.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }

        return shortest.substring(0, i);
    }
}
