package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.eazy.RansomNote;

class RansomNoteTest {

    private final RansomNote ransomNote = new RansomNote();

    @Test
    void test() {
        boolean result = ransomNote.canConstruct("aa", "aab");

        Assertions.assertTrue(result);
    }

    @Test
    void test2() {
        boolean result = ransomNote.canConstruct("aa", "ab");

        Assertions.assertFalse(result);
    }
}
