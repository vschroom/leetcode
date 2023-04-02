package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    void test() {
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicatesFromSortedArray.removeDuplicates(input);
        int[] expectedNums = {0, 1, 2, 3, 4};

        assertEquals(expectedNums.length, k);
        for(int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], input[i]);
        }
    }

    @Test
    void test2() {
        int[] input = {1, 1, 2};
        int k = removeDuplicatesFromSortedArray.removeDuplicates(input);
        int[] expectedNums = {1, 2};

        assertEquals(expectedNums.length, k);
        for(int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], input[i]);
        }
    }
}
