package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {

    private final ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    void test() {
        var result = climbingStairs.climb(5);

        assertEquals(8, result);
    }

    @Test
    void test2() {
        var result = climbingStairs.climb(2);

        assertEquals(2, result);
    }

    @Test
    void test3() {
        var result = climbingStairs.climb(3);

        assertEquals(3, result);
    }

    @Test
    void test4() {
        var result = climbingStairs.climb(4);

        assertEquals(5, result);
    }
}
