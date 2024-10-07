package ru.chernov.binarysearch.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.binarysearch.medium.FindFirstAndLastPositionOfElementInSortedArray;

class FindFirstAndLastPositionOfElementInSortedArrayTest {

    private final FindFirstAndLastPositionOfElementInSortedArray positionOfElementInSortedArray =
            new FindFirstAndLastPositionOfElementInSortedArray();

    @Test
    void test1() {
        int[] nums = {2, 2};
        int target = 3;

        int[] res = positionOfElementInSortedArray.searchRange(nums, target);

        Assertions.assertArrayEquals(new int[]{-1, -1}, res);
    }

    @Test
    void test2() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] res = positionOfElementInSortedArray.searchRange(nums, target);

        Assertions.assertArrayEquals(new int[]{3, 4}, res);
    }

    @Test
    void test3() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;

        int[] res = positionOfElementInSortedArray.searchRange(nums, target);

        Assertions.assertArrayEquals(new int[]{-1, -1}, res);
    }
}
