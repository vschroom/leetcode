package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.eazy.FindAllNumbersDisappearedInAnArray;

import java.util.List;

class FindAllNumbersDisappearedInAnArrayTest {

    private final FindAllNumbersDisappearedInAnArray findAllNumbersDisappearedInAnArray =
            new FindAllNumbersDisappearedInAnArray();

    @Test
    void test1() {
        var result = findAllNumbersDisappearedInAnArray.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});

        Assertions.assertEquals(List.of(5, 6), result);
    }

    @Test
    void test2() {
        var result = findAllNumbersDisappearedInAnArray.findDisappearedNumbers(new int[]{1, 1});

        Assertions.assertEquals(List.of(2), result);
    }
}
