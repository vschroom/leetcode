package ru.chernov.algthms.binarysearch.easy;

/**
 * You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
 * There are at least two different characters in letters.
 * Return the smallest character in letters that is lexicographically greater than target.
 * If such a character does not exist, return the first character in letters.
 */
public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] l, char t) {
        int lo = 0;
        int hi = l.length - 1;
        char res = l[0];
        while (lo <= hi) {
            int mi = lo + (hi- lo) / 2;
            if (l[mi] <= t) {
                lo = mi + 1;
            } else {
                res = l[mi];
                hi = mi - 1;
            }
        }

        return res;
    }
}
