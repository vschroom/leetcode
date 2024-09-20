package ru.chernov.slidingwindow.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.slidingwindow.medium.LongestRepeatingCharacterReplacement;

class LongestRepeatingCharacterReplacementTest {

    private final LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement
            = new LongestRepeatingCharacterReplacement();

    @Test
    void test1() {
        var s = "ABAB";
        int expected = 4;

        int result = longestRepeatingCharacterReplacement.characterReplacement(s, 2);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void test2() {
        var s = "AABABBA";
        int expected = 4;

        int result = longestRepeatingCharacterReplacement.characterReplacement(s, 1);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void test3() {
        var s = "ABABCCCC";
        int expected = 6;

        int result = longestRepeatingCharacterReplacement.characterReplacement(s, 2);

        Assertions.assertEquals(expected, result);
    }
}
