package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {

    private final SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @Test
    void test() {
        int result = searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5);

        assertEquals(2, result);
    }

    @Test
    void test2() {
        int result = searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2);

        assertEquals(1, result);
    }

    @Test
    void test3() {
        int result = searchInsertPosition.searchInsert(new int[]{1, 3}, 2);

        assertEquals(1, result);
    }
}
