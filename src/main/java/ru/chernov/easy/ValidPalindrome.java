package ru.chernov.easy;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            var ch1 = s.charAt(i);
            var ch2 = s.charAt(j);
            var letterOrDigit1 = Character.isLetterOrDigit(ch1);
            var letterOrDigit2 = Character.isLetterOrDigit(ch2);
            if (letterOrDigit1 && letterOrDigit2) {
                if (ch1 != ch2) {
                    return false;
                }
                i++;
                j--;
            } else if (letterOrDigit1) {
                j--;
            } else {
                i++;
            }
        }

        return true;
    }
}
