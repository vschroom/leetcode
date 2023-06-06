package ru.chernov.algorythms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuickSortTest {

    private final QuickSort quickSort = new QuickSort();

    @Test
    void test() {
        var sortList = quickSort.sort(List.of(2, 4, 6, 1, 0, 3, 2));

        assertEquals(List.of(0, 1, 2, 2, 3, 4, 6), sortList);
    }
}
