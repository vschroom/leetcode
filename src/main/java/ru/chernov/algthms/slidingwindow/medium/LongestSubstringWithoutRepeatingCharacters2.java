package ru.chernov.algthms.slidingwindow.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters2 {

    private final Set<Character> store = new HashSet<>();

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ) {
            char cur = s.charAt(i);
            if (!store.contains(cur)) {
                store.add(cur);
                if (max < store.size()) {
                    max = store.size();
                }
                i++;
            } else {
                if (s.charAt(j) != cur) {
                    store.remove(s.charAt(j));
                } else {
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
