package ru.chernov.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.twopointers.medium.ContainerWithMostWater;

class ContainerWithMostWaterTest {

    private final ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    void test() {
        int result = containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});

        Assertions.assertEquals(49, result);
    }

    @Test
    void test2() {
        int result = containerWithMostWater.maxArea(new int[]{1, 8, 6, 30, 5, 32, 8, 3, 7});

        Assertions.assertEquals(60, result);
    }
}
