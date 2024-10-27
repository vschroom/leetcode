package ru.chernov.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.slidingwindow.hard.SlidingWindowMaximum;

class SlidingWindowMaximumTest {

    private final SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();

    @Test
    void test1() {
        int[] result = slidingWindowMaximum.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);

        Assertions.assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, result);
    }
}
