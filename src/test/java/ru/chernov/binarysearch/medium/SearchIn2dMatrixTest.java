package ru.chernov.binarysearch.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.binarysearch.medium.SearchIn2dMatrix;

class SearchIn2dMatrixTest {

    private final SearchIn2dMatrix searchIn2dMatrix = new SearchIn2dMatrix();

    @Test
    void test1() {
        int[][] m = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        boolean res = searchIn2dMatrix.searchMatrix(m, 3);

        Assertions.assertTrue(res);
    }

    @Test
    void test2() {
        int[][] m = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        boolean res = searchIn2dMatrix.searchMatrix(m, 13);

        Assertions.assertFalse(res);
    }
}
