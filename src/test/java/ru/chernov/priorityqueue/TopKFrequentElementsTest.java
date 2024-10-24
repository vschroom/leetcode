package ru.chernov.priorityqueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.priorityqueue.TopKFrequentElements;

class TopKFrequentElementsTest {

    private final TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

    @Test
    void test() {
        int[] result = topKFrequentElements.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);

        Assertions.assertArrayEquals(new int[] {1, 2}, result);
    }
}
