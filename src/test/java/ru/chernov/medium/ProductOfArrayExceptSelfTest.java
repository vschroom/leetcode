package ru.chernov.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

    @Test
    void test1() {
        int[] result = productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4});

        assertArrayEquals(new int[]{24, 12, 8, 6}, result);
    }

    @Test
    void test2() {
        int[] result = productOfArrayExceptSelf.productExceptSelfUseDivision(new int[]{-1, 1, 0, -3, 3});

        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, result);
    }
}
