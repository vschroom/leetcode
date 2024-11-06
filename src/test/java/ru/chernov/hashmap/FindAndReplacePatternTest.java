package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.medium.FindAndReplacePattern;

import java.util.List;

class FindAndReplacePatternTest {

    private final FindAndReplacePattern findAndReplacePattern = new FindAndReplacePattern();

    @Test
    void test() {
        var result = findAndReplacePattern.findAndReplacePattern(
                new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"},
                "abb"
        );

        Assertions.assertEquals(List.of("mee", "aqq"), result);
    }
}
