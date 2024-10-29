package ru.chernov.algthms.twopointers.easy;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class ReverseString {

    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i <= j; i++, j--) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }
    }
}
