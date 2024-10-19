package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.eazy.WordPattern;

class WordPatternTest {

    private final WordPattern wordPattern = new WordPattern();

    @Test
    void test() {
        boolean result = wordPattern.wordPattern("abba", "dog cat cat dog");

        Assertions.assertTrue(result);
    }

    @Test
    void test2() {
        boolean result = wordPattern.wordPattern("abba", "dog dog dog dog");

        Assertions.assertFalse(result);
    }
}
