package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.eazy.FindTheDifference;

class FindTheDifferenceTest {

    private final FindTheDifference findTheDifference = new FindTheDifference();

    @Test
    void test1() {
        char result = findTheDifference.findTheDifference("abcd", "abcde");

        Assertions.assertEquals('e', result);
    }

    @Test
    void test2() {
        char result = findTheDifference.findTheDifference("", "y");

        Assertions.assertEquals('y', result);
    }
}
