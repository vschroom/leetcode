package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.medium.SortCharactersByFrequency;

class SortCharactersByFrequencyTest {

    private final SortCharactersByFrequency sortCharactersByFrequency =
            new SortCharactersByFrequency();

    @Test
    void test() {
        var result = sortCharactersByFrequency.frequencySort("raaeaedere");

        Assertions.assertEquals("eeeeaaarrd", result);
    }
}
