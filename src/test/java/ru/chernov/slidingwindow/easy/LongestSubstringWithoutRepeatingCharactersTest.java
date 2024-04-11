package ru.chernov.slidingwindow.easy;

import org.junit.jupiter.api.Test;
import ru.chernov.slidingwindow.medium.LongestSubstringWithoutRepeatingCharacters;

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
}
