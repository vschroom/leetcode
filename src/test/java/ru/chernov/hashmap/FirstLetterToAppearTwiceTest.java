package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.eazy.FirstLetterToAppearTwice;

class FirstLetterToAppearTwiceTest {

    private final FirstLetterToAppearTwice firstLetterToAppearTwice = new FirstLetterToAppearTwice();


    @Test
    void test() {
        char result = firstLetterToAppearTwice.repeatedCharacter("abccbaacz");

        Assertions.assertEquals('c', result);
    }
}
