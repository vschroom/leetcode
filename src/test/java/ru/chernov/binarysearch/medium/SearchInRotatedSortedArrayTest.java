package ru.chernov.binarysearch.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.binarysearch.medium.SearchInRotatedSortedArray;

class SearchInRotatedSortedArrayTest {

    private final SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();

    @Test
    void test1() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int res = searchInRotatedSortedArray.search(nums, target);

        Assertions.assertEquals(4, res);
    }

    @Test
    void test2() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 5;

        int res = searchInRotatedSortedArray.search(nums, target);

        Assertions.assertEquals(1, res);
    }

    @Test
    void test3() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 3;

        int res = searchInRotatedSortedArray.search(nums, target);

        Assertions.assertEquals(-1, res);
    }
}
