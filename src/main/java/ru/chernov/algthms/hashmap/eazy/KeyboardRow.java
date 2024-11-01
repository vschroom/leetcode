package ru.chernov.algthms.hashmap.eazy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row
 * of American keyboard like the image below.
 * In the American keyboard:
 * the first row consists of the characters "qwertyuiop",
 * the second row consists of the characters "asdfghjkl", and
 * the third row consists of the characters "zxcvbnm".
 */
public class KeyboardRow {

    private final Map<String, List<Character>> map = Map.of(
            "first", List.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'),
            "second", List.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'),
            "third", List.of('z', 'x', 'c', 'v', 'b', 'n', 'm', 'Z', 'X', 'C', 'V', 'B', 'N', 'M')
    );

    public String[] findWords(String[] words) {
        var res = new String[words.length];

        int j = 0;
        for (var word : words) {
            boolean first = true;
            boolean sec = true;
            boolean third = true;
            for (int i = 0; i < word.length(); i++) {
                if (!map.get("first").contains(word.charAt(i))) {
                    first = false;
                }
                if (!map.get("second").contains(word.charAt(i))) {
                    sec = false;
                }
                if (!map.get("third").contains(word.charAt(i))) {
                    third = false;
                }
                if (!first && !sec && !third) {
                    break;
                }
            }

            if (first || sec || third) {
                res[j] = word;
                j++;
            }
        }

        return Arrays.copyOf(res, j);
    }
}
