package ru.chernov.easy;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class Palindrome {

    /**
     * 9 ms
     *
     * @param x Входное значение.
     * @return true - если значение палиндром, false - если нет.
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        var revers = 0;
        var copy = x;
        while (copy > 0) {
            var last = copy % 10;
            revers = (revers * 10) + last;
            copy = copy / 10;
        }

        return x == revers;
    }

    /**
     * 11 ms
     *
     * @param x Входное значение.
     * @return true - если значение палиндром, false - если нет.
     */
    public boolean isPalindrome2(int x) {
        var input = Integer.toString(x).toCharArray();
        var length = input.length;
        for (int i = 0, j = length - 1; i < length; i++, j--) {
            if (input[i] != input[j]) {
                return false;
            }
        }

        return true;
    }

    /**
     * 13 ms
     *
     * @param x Входное значение.
     * @return true - если значение палиндром, false - если нет.
     */
    public boolean isPalindrome3(int x) {
        var input = new StringBuilder(Integer.toString(x));

        return input.toString().equals(input.reverse().toString());
    }
}
