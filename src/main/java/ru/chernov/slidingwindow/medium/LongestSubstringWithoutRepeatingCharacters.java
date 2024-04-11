package ru.chernov.slidingwindow.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    // основная идея: храним в store количество символов которые встретили, если символ уже встретился
    // - удаляем с начала строки все символы пока не встретим наш новый и записываем максимальную длину
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> store = new HashMap<>();

        int maxLen = 0;
        int l = 0;
        // идем по строке
        for (int r = 0; r < s.length(); r++) {
            // берем символ
            char c = s.charAt(r);
            // если символ уже встречался, то с начала подстроки начинаем удалять элементы,
            // до тех пор пока кроме остальных не удалим текущий (кот. встретился 2ой раз)
            while (store.get(c) != null) {
                store.remove(s.charAt(l));
                l++;
            }
            // кладем текущий (новый) элемент в store
            store.put(c, 1);
            // длина наибольшей подстроки - это размер мапы в котрой хранятся элементы в тек. момент
            maxLen = Math.max(store.size(), maxLen);
        }

        return maxLen;
    }
}
