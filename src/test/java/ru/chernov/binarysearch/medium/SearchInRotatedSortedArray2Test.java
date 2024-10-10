package ru.chernov.binarysearch.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.binarysearch.medium.SearchInRotatedSortedArray2;

class SearchInRotatedSortedArray2Test {

    private final SearchInRotatedSortedArray2 searchInRotatedSortedArray2 = new SearchInRotatedSortedArray2();

    @Test
    void test() {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int t = 0;

        boolean res = searchInRotatedSortedArray2.search(nums, t);

        Assertions.assertTrue(res);
    }
}
