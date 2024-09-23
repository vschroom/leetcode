package ru.chernov.slidingwindow.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.slidingwindow.easy.MaxAverageSubArray;

class MaxAverageSubArrayTest {

    private final MaxAverageSubArray maxAverageSubArray = new MaxAverageSubArray();

    @Test
    void test() {
        int[] nums = {5};
        int k = 1;
        double expected = 5.0;

        double result = maxAverageSubArray.findMaxAverage(nums, k);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void test2() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double expected = 12.75;

        double result = maxAverageSubArray.findMaxAverage(nums, k);

        Assertions.assertEquals(expected, result);
    }
}
