package ru.chernov.binarysearch.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.binarysearch.medium.FindMinimumInRotatedSortedArray;

class FindMinimumInRotatedSortedArrayTest {

    private final FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray
            = new FindMinimumInRotatedSortedArray();

    @Test
    void test1() {
        int res = findMinimumInRotatedSortedArray.findMin(new int[]{4, 5, 6, 7, 0, 1, 2});

        Assertions.assertEquals(0, res);
    }

    @Test
    void test2() {
        int res = findMinimumInRotatedSortedArray.findMin(new int[]{4, 5, 6, 7, 2});

        Assertions.assertEquals(2, res);
    }

    @Test
    void test3() {
        int res = findMinimumInRotatedSortedArray.findMin2(new int[]{3, 1, 2});

        Assertions.assertEquals(1, res);
    }
}
