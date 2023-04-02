package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrtTest {

    private final Sqrt sqrt = new Sqrt();

    @Test
    void test() {
        int result = sqrt.mySqrt(4);

        assertEquals(2, result);
    }

    @Test
    void test2() {
        int result = sqrt.mySqrt(3);

        assertEquals(1, result);
    }

    @Test
    void test3() {
        int result = sqrt.mySqrt(2);

        assertEquals(1, result);
    }

    @Test
    void test4() {
        int result = sqrt.mySqrt(1);

        assertEquals(1, result);
    }

    @Test
    void test5() {
        int result = sqrt.mySqrt(0);

        assertEquals(0, result);
    }

    @Test
    void test6() {
        int result = sqrt.mySqrt(9);

        assertEquals(3, result);
    }
}
