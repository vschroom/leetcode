package ru.chernov.easy;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        var count = 0;
        var isLast = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && isLast) {
                return count;
            } else if (s.charAt(i) != ' ') {
                count++;
                if (i > 0 && s.charAt(i - 1) == ' ') {
                    isLast = true;
                }
            }
        }

        return count;
    }

    public int lengthOfLastWord2(String s) {
        var arr = s.split(" ");

        return arr[arr.length - 1].length();
    }
}
