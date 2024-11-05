package ru.chernov.algthms.hashmap.eazy;

import java.util.HashSet;

/**
 * Given a string s consisting of lowercase English letters, return the first letter to appear twice.
 */
public class FirstLetterToAppearTwice {

    private final HashSet<Character> set = new HashSet<>();

    public char repeatedCharacter(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return s.charAt(i);
            } else {
                set.add(s.charAt(i));
            }
        }

        return '.';
    }
}
