package ru.chernov.binarysearch.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.binarysearch.medium.SearchIn2dMatrix2;

class SearchIn2dMatrix2Test {

    private final SearchIn2dMatrix2 searchIn2dMatrix2 = new SearchIn2dMatrix2();

    @Test
    void test1() {
        int[][] m = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int t = 5;

        boolean res = searchIn2dMatrix2.searchMatrix(m, t);

        Assertions.assertTrue(res);
    }

    @Test
    void test2() {
        int[][] m = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int t = 5;

        boolean res = searchIn2dMatrix2.searchMatrix2(m, t);

        Assertions.assertTrue(res);
    }
}
