package ru.chernov.slidingwindow.medium;

import org.junit.jupiter.api.Test;
import ru.chernov.algthms.slidingwindow.medium.PermutationInString;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PermutationInStringTest {

    private final PermutationInString permutationInString = new PermutationInString();

    @Test
    void test1() {
        boolean result = permutationInString.checkInclusion("ab", "eidbaooo");

        assertTrue(result);
    }

    @Test
    void test2() {
        boolean result = permutationInString.checkInclusion("adc", "dcda");

        assertTrue(result);
    }

    @Test
    void test3() {
        boolean result = permutationInString.checkInclusion("horse", "ros");

        assertFalse(result);
    }

    @Test
    void test4() {
        boolean result = permutationInString.checkInclusion("hello", "ooolleoooleh");

        assertFalse(result);
    }
}
