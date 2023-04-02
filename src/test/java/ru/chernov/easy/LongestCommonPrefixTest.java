package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void test() {
        var result = longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"});

        assertEquals("fl", result);
    }

    @Test
    void test2() {
        var result = longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"});

        assertEquals("", result);
    }

    @Test
    void test3() {
        var result = longestCommonPrefix.longestCommonPrefix(new String[]{"cir","car"});

        assertEquals("c", result);
    }

    @Test
    void test4() {
        var result = longestCommonPrefix.longestCommonPrefix2(new String[]{"flower","flow","flight"});

        assertEquals("fl", result);
    }

    @Test
    void test5() {
        var result = longestCommonPrefix.longestCommonPrefix2(new String[]{"dog","racecar","car"});

        assertEquals("", result);
    }

    @Test
    void test6() {
        var result = longestCommonPrefix.longestCommonPrefix2(new String[]{"cir","car"});

        assertEquals("c", result);
    }
}
