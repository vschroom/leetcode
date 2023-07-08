package ru.chernov.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchMatrixTest {

    private final SearchMatrix searchMatrix = new SearchMatrix();

    @Test
    void test() {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean result = searchMatrix.searchMatrix(matrix, 3);

        assertTrue(result);
    }
}
