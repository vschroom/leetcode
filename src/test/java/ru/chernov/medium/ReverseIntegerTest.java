package ru.chernov.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {

    private final ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    void test() {
        var result = reverseInteger.reverse(1534236469);

        assertEquals(0, result);
    }
}
