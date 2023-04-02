package ru.chernov.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two ones added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four. The same principle applies to the number nine,
 * which is written as IX. There are six instances where subtraction is used:
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * Example 1:
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * Example 2:
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * Constraints:
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
@SuppressWarnings("java:S1643")
public class RomanToInteger {

    private static final Map<String, Integer> STORE = new HashMap<>();

    static {
        STORE.put("CM", 900);
        STORE.put("M", 1000);
        STORE.put("CD", 400);
        STORE.put("D", 500);
        STORE.put("XC", 90);
        STORE.put("C", 100);
        STORE.put("XL", 40);
        STORE.put("L", 50);
        STORE.put("IX", 9);
        STORE.put("X", 10);
        STORE.put("IV", 4);
        STORE.put("V", 5);
        STORE.put("III", 3);
        STORE.put("II", 2);
        STORE.put("I", 1);
    }

    public int romanToInt(String s) {
        if (s.isBlank()) {
            return 0;
        }

        String str = "";
        int result = 0;
        var romans = s.split("");
        for (var r : romans) {
            if (STORE.containsKey(str + r)) {
                str = str.concat(r);
            } else {
                result += STORE.get(str);
                str = r;
            }
        }
        result += STORE.get(str);

        return result;
    }

    public int romanToInt2(String s) {
        int result = 0;
        int prev = 0;
        int num;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M' -> num = 1000;
                case 'D' -> num = 500;
                case 'C' -> num = 100;
                case 'L' -> num = 50;
                case 'X' -> num = 10;
                case 'V' -> num = 5;
                case 'I' -> num = 1;
                default -> {continue;}
            }

            if (num < prev) {
                result -= num;
            } else {
                result += num;
            }
            prev = num;
        }

        return result;
    }
}
