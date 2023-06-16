package ru.chernov.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAnagramsTest {

    private final GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    void test() {
        List<List<String>> result = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        assertEquals(List.of(List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat")), result);
    }
}
