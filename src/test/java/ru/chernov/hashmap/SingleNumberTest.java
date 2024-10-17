package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.eazy.SingleNumber;

class SingleNumberTest {

    private final SingleNumber singleNumber = new SingleNumber();

    @Test
    void test1() {
        int result = singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2});

        Assertions.assertEquals(4, result);
    }

    @Test
    void test2() {
        int result = singleNumber.singleNumber2(new int[]{4, 1, 2, 1, 2});

        Assertions.assertEquals(4, result);
    }
}
