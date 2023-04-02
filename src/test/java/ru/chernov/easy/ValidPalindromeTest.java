package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void test() {
        var result = validPalindrome.isPalindrome("A man, a plan, a canal: Panama");

        assertTrue(result);
    }
}
