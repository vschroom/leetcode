package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.eazy.FirstUniqueCharacterInString;

class FirstUniqueCharacterInStringTest {

    private final FirstUniqueCharacterInString firstUniqueCharacterInString = new FirstUniqueCharacterInString();

    @Test
    void test1() {
        int result = firstUniqueCharacterInString.firstUniqueChar("leetcode");

        Assertions.assertEquals(0, result);
    }

    @Test
    void test2() {
        int result = firstUniqueCharacterInString.firstUniqueChar("loveleetcode");

        Assertions.assertEquals(2, result);
    }

    @Test
    void test3() {
        int result = firstUniqueCharacterInString.firstUniqueChar("aabb");

        Assertions.assertEquals(-1, result);
    }
}
