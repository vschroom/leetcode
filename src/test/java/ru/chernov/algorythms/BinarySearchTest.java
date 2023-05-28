package ru.chernov.algorythms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    private final BinarySearch binarySearchClass = new BinarySearch();

    @Test
    void binarySearchTest() {
        int[] arr = {1, 2, 5, 6, 9, 20, 25, 30, 43, 54, 70};
        int index = binarySearchClass.binarySearch(arr, 20);

        assertEquals(5, index);
    }

    @Test
    void getMaxTest() {
        int[] arr = {100, 20, 25, 30, 43, 54, 70};
        int max = binarySearchClass.getMax(arr);

        assertEquals(100, max);
    }
}
