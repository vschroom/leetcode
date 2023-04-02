package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void twoSum() {
        var nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        var target = 8;
        var result = twoSum.twoSumByDirect(nums, target);

        assertArrayEquals(new int[] {0, 6}, result);
    }

    @Test
    void twoSum1() {
        var nums = new int[] {};
        var target = 8;
        var result = twoSum.twoSum(nums, target);

        assertArrayEquals(new int[0], result);
    }

    @Test
    void twoSum2() {
        var nums = new int[] {1, 2, 3, 4};
        var target = 8;
        var result = twoSum.twoSum(nums, target);

        assertArrayEquals(new int[0], result);
    }

    @Test
    void twoSum3() {
        var nums = new int[] {6, 2};
        var target = 8;
        var result = twoSum.twoSum(nums, target);

        assertArrayEquals(new int[] {1, 0}, result);
    }
}
