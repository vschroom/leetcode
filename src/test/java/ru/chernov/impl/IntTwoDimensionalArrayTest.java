package ru.chernov.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntTwoDimensionalArrayTest {

    @Test
    void test1() {
        var twoDimensionalArray = new IntTwoDimensionalArray(3, 4);

        twoDimensionalArray.add(0, 0, 4);
        twoDimensionalArray.add(1, 0, 6);
        twoDimensionalArray.add(2, 0, 3);
        twoDimensionalArray.add(1, 1, 1);
        twoDimensionalArray.add(2, 1, 7);
        twoDimensionalArray.add(0, 1, 8);
        twoDimensionalArray.add(2, 2, 9);
        twoDimensionalArray.add(1, 3, 18);

        Assertions.assertArrayEquals(
                new int[]{4, 6, 3, 8, 1, 7, 0, 0, 9, 0, 18, 0},
                twoDimensionalArray.arr);
    }
}
