package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SignOfTheProductOfAnArrayTest {

    private final SignOfTheProductOfAnArray signOfTheProductOfAnArray = new SignOfTheProductOfAnArray();

    @Test
    void test() {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        int result = signOfTheProductOfAnArray.arraySign(nums);

        assertEquals(1, result);
    }
}
