package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {

    private final ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void test1() {
        var isAnagram = validAnagram.isAnagram("anagram", "nagaram");

        assertTrue(isAnagram);
    }

    @Test
    void test2() {
        var isAnagram = validAnagram.isAnagram("rat", "car");

        assertFalse(isAnagram);
    }

    @Test
    void test3() {
        var isAnagram = validAnagram.isAnagram2("anagram", "nagaram");

        assertTrue(isAnagram);
    }
}
