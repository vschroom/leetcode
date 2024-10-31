package ru.chernov.algthms.hashmap.eazy;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 */
public class FirstUniqueCharacterInString {

    public int firstUniqueChar(String s) {
        int[] lt = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lt[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (lt[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
