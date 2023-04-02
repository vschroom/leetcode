package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    private final RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void test() {
        var result = romanToInteger.romanToInt("III");

        assertEquals(3, result);
    }

    @Test
    void test2() {
        var result = romanToInteger.romanToInt("LVIII");

        assertEquals(58, result);
    }

    @Test
    void test3() {
        var result = romanToInteger.romanToInt("MCMXCIV");

        assertEquals(1994, result);
    }

    @Test
    void test4() {
        var result = romanToInteger.romanToInt2("DCXXI");

        assertEquals(621, result);
    }

    @Test
    void test5() {
        var result = romanToInteger.romanToInt2("LVIII");

        assertEquals(58, result);
    }

    @Test
    void test6() {
        var result = romanToInteger.romanToInt2("MCMXCIV");

        assertEquals(1994, result);
    }
}
