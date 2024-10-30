package ru.chernov.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThirdMaximumNumberTest {

    private final ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();

    @Test
    void test() {
        int result = thirdMaximumNumber.thirdMax(new int[]{3, 2, 1});

        Assertions.assertEquals(1, result);
    }
}
