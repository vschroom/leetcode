package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySumTest {

    private final BinarySum binarySum = new BinarySum();

    @Test
    void test() {
        var result = binarySum.addBinary("11", "1");

        assertEquals("100", result);
    }

    @Test
    void test2() {
        var result = binarySum.addBinary("0", "0");

        assertEquals("0", result);
    }
}
