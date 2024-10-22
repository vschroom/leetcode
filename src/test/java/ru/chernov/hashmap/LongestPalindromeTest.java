package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.eazy.LongestPalindrome;

class LongestPalindromeTest {

    private final LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    void test() {
        int result = longestPalindrome.longestPalindrome("abccccdd");

        Assertions.assertEquals(7, result);
    }
}
