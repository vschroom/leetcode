package ru.chernov.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TopFrequentElementsTest {

    private final TopFrequentElements topFrequentElements = new TopFrequentElements();

    @Test
    void test1() {
        int[] result = topFrequentElements.topFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);

        assertArrayEquals(new int[] {1, 2}, result);
    }
}
