package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {

    private final SingleNumber singleNumber = new SingleNumber();

    @Test
    void test1() {
        assertEquals(4, singleNumber.singleNumber(new int[]{4, 2, 1, 2, 1}));
    }

    @Test
    void test2() {
        assertEquals(1, singleNumber.singleNumber(new int[]{1}));
    }

    @Test
    void test3() {
        assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    void test4() {
        assertEquals(9, singleNumber.singleNumber2(new int[]{2, 2, 1, 1, 5, 4, 5, 4, 9}));
    }
}
