package ru.chernov.algthms.slidingwindow.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        int[] t = new int[26];
        int window = p.length();
        for (int i = 0; i < window; i++) {
            t[p.charAt(i) - 'a'] += 1;
        }
        ArrayList<Integer> res = new ArrayList<>();
        int[] cur = new int[26];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i >= window) {
                if (Arrays.equals(t, cur)) {
                    res.add(j);
                }
                cur[s.charAt(j) - 'a'] -= 1;
                j++;
            }
            cur[s.charAt(i) - 'a'] += 1;
        }
        if (Arrays.equals(t, cur)) {
            res.add(j);
        }

        return res;
    }
}
