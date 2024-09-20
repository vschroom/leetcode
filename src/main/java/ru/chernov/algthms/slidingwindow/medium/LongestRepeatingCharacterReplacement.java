package ru.chernov.algthms.slidingwindow.medium;

/**
 * You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase
 * English character. You can perform this operation at most k times.
 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
 */
public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        int maxCntOfUniqueCharacter = 0; // максимальное кол-во уникальных символов в окне.
        int res = 0;
        int[] arr = new int[26]; // для хранения символов англ. алфавита в верхнем регистре.

        for (int r = 0, l = 0; r < s.length(); r++) {
            int idx = s.charAt(r) - 'A'; // позиция в массиве.
            arr[idx]++; // добавление кол-ва для символа.

            maxCntOfUniqueCharacter = Math.max(maxCntOfUniqueCharacter, arr[idx]); // определить максимальное кол-во для символа (либо текущий символ больше всего встречался, либо другой)

            if (r - l + 1 - maxCntOfUniqueCharacter > k) { // если длина окна минус это кол-во символа больше чем k, то уменьшаем окно и кол-во для символа слева
                arr[s.charAt(l) - 'A']--;
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
