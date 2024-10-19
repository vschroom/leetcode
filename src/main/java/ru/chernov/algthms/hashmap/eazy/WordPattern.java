package ru.chernov.algthms.hashmap.eazy;

import java.util.HashMap;

/**
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 * Specifically:
 * Each letter in pattern maps to exactly one unique word in s.
 * Each unique word in s maps to exactly one letter in pattern.
 * No two letters map to the same word, and no two words map to the same letter.
 */
public class WordPattern {

    HashMap<Character, String> matches = new HashMap<>();

    public boolean wordPattern(String p, String s) {
        var words = s.split(" ");
        if (words.length != p.length()) {
            return false;
        }
        for (int i = 0; i < p.length(); i++) {
            char cur = p.charAt(i);
            var word = words[i];
            if (matches.containsKey(cur)) {
                if (!matches.get(cur).equals(word)) {
                    return false;
                }
            } else {
                if (matches.containsValue(word)) {
                    return false;
                }
                matches.put(cur, word);
            }
        }

        return true;
    }
}
