package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {

    private final MissingNumber missingNumber = new MissingNumber();

    @Test
    void test1() {
        int[] nums = {3, 0, 1};
        int result = missingNumber.missingNumber(nums);

        assertEquals(2, result);
    }

    @Test
    void test2() {
        int[] nums = {0, 1};
        int result = missingNumber.missingNumber(nums);

        assertEquals(2, result);
    }

    @Test
    void test3() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int result = missingNumber.missingNumber(nums);

        assertEquals(8, result);
    }
}
