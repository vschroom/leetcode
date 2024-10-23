package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.medium.FindAllDuplicatesInAnArray;

import java.util.List;

class FindAllDuplicatesInAnArrayTest {

    private final FindAllDuplicatesInAnArray findAllDuplicatesInAnArray =
            new FindAllDuplicatesInAnArray();

    @Test
    void test() {
        var result = findAllDuplicatesInAnArray.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1});

        Assertions.assertEquals(List.of(2, 3), result);
    }
}
