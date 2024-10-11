package ru.chernov.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckIfNAndItsDoubleExistTest {

    private final CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();

    @Test
    void test() {
        boolean result = checkIfNAndItsDoubleExist.checkIfExist(new int[]{10, 2, 5, 3});

        Assertions.assertTrue(result);
    }
}
