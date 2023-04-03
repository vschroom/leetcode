package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IndexOfTheFirstOccurrenceTest {

    private final IndexOfTheFirstOccurrence indexOfTheFirstOccurrence = new IndexOfTheFirstOccurrence();

    @Test
    void test() {
        var result = indexOfTheFirstOccurrence.strStr("sadbutsad", "sad");

        assertEquals(0, result);
    }

    @Test
    void test2() {
        var result = indexOfTheFirstOccurrence.strStr("leetcode", "leeto");

        assertEquals(-1, result);
    }

    @Test
    void test3() {
        var result = indexOfTheFirstOccurrence.strStr2("digital", "ta");

        assertEquals(4, result);
    }

    @Test
    void test4() {
        var result = indexOfTheFirstOccurrence.strStr2("mississippi", "issip");

        assertEquals(4, result);
    }
}
