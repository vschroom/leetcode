package ru.chernov.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int temp = 0;
        int i = 0;
        while (i < s.length()) {
            if (map.containsKey(s.charAt(i))) {
                if (res < temp) {
                    res = temp;
                }
                i = map.get(s.charAt(i)) + 1;
                map.clear();
                temp = 0;
            }
            map.put(s.charAt(i), i);
            temp++;
            i++;
        }

        return Math.max(res, temp);
    }

    public int lengthOfLongestSubstring2(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                while (s.charAt(temp) != s.charAt(i)) {
                    set.remove(s.charAt(temp));
                    temp++;
                }
                set.remove(s.charAt(temp));
                temp++;
                set.add(s.charAt(i));
            } else {
                set.add(s.charAt(i));
                maxLength = Math.max(maxLength, i - temp + 1);
            }
        }
        return maxLength;
    }
}
