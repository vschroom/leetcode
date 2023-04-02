package ru.chernov.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters =
            new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void test() {
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("aab");

        assertEquals(2, result);
    }

    @Test
    void test2() {
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("dvdf");

        assertEquals(3, result);
    }

    @Test
    void test3() {
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb");

        assertEquals(3, result);
    }

    @Test
    void test4() {
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");

        assertEquals(3, result);
    }

    @Test
    void test5() {
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2("aab");

        assertEquals(2, result);
    }

    @Test
    void test6() {
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2("dvdf");

        assertEquals(3, result);
    }

    @Test
    void test7() {
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2("abcabcbb");

        assertEquals(3, result);
    }

    @Test
    void test8() {
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2("pwwkew");

        assertEquals(3, result);
    }

    @Test
    void test9() {
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2("jxdlnaaij");

        assertEquals(6, result);
    }
}
