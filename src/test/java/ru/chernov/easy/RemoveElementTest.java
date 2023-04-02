package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {

    private final RemoveElement removeElement = new RemoveElement();

    @Test
    void test() {
        int[] input = {0,1,2,2,3,0,4,2};
        var val = 2;
        int k = removeElement.removeElement(input, val);
        int[] expectedNums = {0, 0, 1, 3, 4};
        Arrays.sort(input, 0, k);

        assertEquals(expectedNums.length, k);
        for(int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], input[i]);
        }
    }

    @Test
    void test2() {
        int[] input = {3,2,2,3};
        var val = 3;
        int k = removeElement.removeElement(input, val);
        int[] expectedNums = {2, 2};
        Arrays.sort(input, 0, k);

        assertEquals(expectedNums.length, k);
        for(int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], input[i]);
        }
    }

    @Test
    void test3() {
        int[] input = {0,1,2,2,3,0,4,2};
        var val = 2;
        int k = removeElement.removeElement2(input, val);
        int[] expectedNums = {0, 0, 1, 3, 4};
        Arrays.sort(input, 0, k);

        assertEquals(expectedNums.length, k);
        for(int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], input[i]);
        }
    }

    @Test
    void test4() {
        int[] input = {3,2,2,3};
        var val = 3;
        int k = removeElement.removeElement2(input, val);
        int[] expectedNums = {2, 2};
        Arrays.sort(input, 0, k);

        assertEquals(expectedNums.length, k);
        for(int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], input[i]);
        }
    }
}
