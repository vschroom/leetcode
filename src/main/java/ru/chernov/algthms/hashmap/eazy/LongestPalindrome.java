package ru.chernov.algthms.hashmap.eazy;

import java.util.HashMap;

public class LongestPalindrome {

    HashMap<Character, Integer> map = new HashMap<>();

    public int longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            int val = map.getOrDefault(cur, 0);
            map.put(cur, ++val);
        }

        int len = 0;
        int rem = 0;
        for (var count : map.values()) {
            if (count % 2 == 0) {
                len += count;
            } else if (count - 1 > 0) {
                len += count - 1;
                if (rem == 0) {
                    rem = 1;
                }
            } else if (count == 1 && rem == 0) {
                rem = 1;
            }
        }

        return len + rem;
    }
}
