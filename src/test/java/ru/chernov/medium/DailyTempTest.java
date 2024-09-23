package ru.chernov.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DailyTempTest {

    private final DailyTemp dailyTemp = new DailyTemp();

    @Test
    void test1() {
        int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};

        int[] result = dailyTemp.dailyTemperatures(temps);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void test2() {
        int[] temps = {30, 40, 50, 60};
        int[] expected = {1, 1, 1, 0};

        int[] result = dailyTemp.dailyTemperatures(temps);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void test3() {
        int[] temps = {30, 60, 90};
        int[] expected = {1, 1, 0};

        int[] result = dailyTemp.dailyTemperatures(temps);

        Assertions.assertArrayEquals(expected, result);
    }
}
