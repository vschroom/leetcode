package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.eazy.HappyNumber;

class HappyNumberTest {

    private final HappyNumber happyNumber = new HappyNumber();

    @Test
    void test() {
        boolean result = happyNumber.isHappy(3);

        Assertions.assertFalse(result);
    }

    @Test
    void test2() {
        boolean result = happyNumber.isHappy2(3);

        Assertions.assertFalse(result);
    }
}
