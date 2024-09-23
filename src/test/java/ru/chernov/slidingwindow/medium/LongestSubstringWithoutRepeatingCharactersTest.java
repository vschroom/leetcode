package ru.chernov.slidingwindow.medium;

import org.junit.jupiter.api.Test;
import ru.chernov.algthms.slidingwindow.medium.LongestSubstringWithoutRepeatingCharacters;
import ru.chernov.algthms.slidingwindow.medium.LongestSubstringWithoutRepeatingCharacters2;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters =
            new LongestSubstringWithoutRepeatingCharacters();
    private final LongestSubstringWithoutRepeatingCharacters2 longestSubstringWithoutRepeatingCharacters2 =
            new LongestSubstringWithoutRepeatingCharacters2();

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
        int result = longestSubstringWithoutRepeatingCharacters2.lengthOfLongestSubstring("abcabcbb");

        assertEquals(3, result);
    }

    @Test
    void test4() {
        int result = longestSubstringWithoutRepeatingCharacters2.lengthOfLongestSubstring("pwwkew");

        assertEquals(3, result);
    }
}
