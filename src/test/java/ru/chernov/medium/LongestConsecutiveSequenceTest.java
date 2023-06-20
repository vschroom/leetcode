package ru.chernov.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveSequenceTest {

    private final LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();

    @Test
    void test() {
        int result = longestConsecutiveSequence.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});

        assertEquals(9, result);
    }
}
