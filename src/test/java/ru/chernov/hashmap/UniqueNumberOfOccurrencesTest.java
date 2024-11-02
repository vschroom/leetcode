package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.eazy.UniqueNumberOfOccurrences;

class UniqueNumberOfOccurrencesTest {

    private final UniqueNumberOfOccurrences uniqueNumberOfOccurrences = new UniqueNumberOfOccurrences();

    @Test
    void test() {
        boolean result = uniqueNumberOfOccurrences.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3});

        Assertions.assertTrue(result);
    }
}
