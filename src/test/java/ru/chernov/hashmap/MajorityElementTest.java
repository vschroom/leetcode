package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.eazy.MajorityElement;

class MajorityElementTest {

    private final MajorityElement majorityElement = new MajorityElement();

    @Test
    void test() {
        int result = majorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});

        Assertions.assertEquals(2, result);
    }
}
