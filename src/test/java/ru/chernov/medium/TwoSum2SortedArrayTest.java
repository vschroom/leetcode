package ru.chernov.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSum2SortedArrayTest {

    private final TwoSum2SortedArray twoSum2SortedArray = new TwoSum2SortedArray();

    @Test
    void test1() {
        int[] input = new int[]{2, 7, 11, 15};
        int[] result = twoSum2SortedArray.twoSum(input, 9);

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void test2() {
        int[] input = new int[]{2,3,4};
        int[] result = twoSum2SortedArray.twoSum(input, 6);

        assertArrayEquals(new int[]{1,3}, result);
    }

    @Test
    void test3() {
        int[] input = new int[]{-1,0};
        int[] result = twoSum2SortedArray.twoSum(input, -1);

        assertArrayEquals(new int[]{1, 2}, result);
    }
}
