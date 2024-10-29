package ru.chernov.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.twopointers.easy.ReverseString;

class ReverseStringTest {

    private final ReverseString reverseString = new ReverseString();

    @Test
    void test() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString.reverseString(s);

        Assertions.assertArrayEquals(new char[] {'o', 'l', 'l', 'e', 'h'}, s);
    }
}
