package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlusOneTest {

    private final PlusOne plusOne = new PlusOne();

    @Test
    void test() {
        var result = plusOne.plusOne(new int[]{1, 2, 3});

        assertArrayEquals(new int[] {1, 2, 4}, result);
    }

    @Test
    void test2() {
        var result = plusOne.plusOne(new int[]{9});

        assertArrayEquals(new int[] {1, 0}, result);
    }

    @Test
    void test3() {
        var result = plusOne.plusOne2(new int[]{4, 5, 9});

        assertArrayEquals(new int[] {4, 6, 0}, result);
    }

    @Test
    void test4() {
        var result = plusOne.plusOne2(new int[]{9, 9, 9, 9, 9, 9});

        assertArrayEquals(new int[] {1, 0, 0, 0, 0, 0, 0}, result);
    }
}
