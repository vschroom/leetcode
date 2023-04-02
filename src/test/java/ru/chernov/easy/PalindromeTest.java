package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    private final Palindrome palindromeClass = new Palindrome();

    @Test
    void isPalindrome() {
        var palindrome = palindromeClass.isPalindrome(122353221);

        assertTrue(palindrome);
    }

    @Test
    void isPalindrome2() {
        var palindrome = palindromeClass.isPalindrome2(122353221);

        assertTrue(palindrome);
    }

    @Test
    void isPalindrome3() {
        var palindrome = palindromeClass.isPalindrome3(-2147483648);

        assertFalse(palindrome);
    }
}
