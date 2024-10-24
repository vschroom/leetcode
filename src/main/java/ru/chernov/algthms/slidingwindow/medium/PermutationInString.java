package ru.chernov.algthms.slidingwindow.medium;

import java.util.Arrays;

/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * In other words, return true if one of s1's permutations is the substring of s2.
 */
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        int[] t = new int[26];
        int window = s1.length();
        for (int i = 0; i < window; i++) {
            t[s1.charAt(i) - 'a']++;
        }

        int[] res = new int[26];
        int j = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (i >= window) {
                if (Arrays.equals(res, t)) {
                    return true;
                }

                res[s2.charAt(j) - 'a']--;
                j++;
            }
            res[s2.charAt(i) - 'a']++;
        }

        return Arrays.equals(res, t);
    }
}
