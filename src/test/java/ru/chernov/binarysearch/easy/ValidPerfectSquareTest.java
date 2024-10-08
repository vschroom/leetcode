package ru.chernov.binarysearch.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.binarysearch.easy.ValidPerfectSquare;

class ValidPerfectSquareTest {

    private final ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();

    @Test
    void test1() {
        boolean result = validPerfectSquare.isPerfectSquare(36);

        Assertions.assertTrue(result);
    }

    @Test
    void test2() {
        boolean result = validPerfectSquare.isPerfectSquare(16);

        Assertions.assertTrue(result);
    }

    @Test
    void test3() {
        boolean result = validPerfectSquare.isPerfectSquare(14);

        Assertions.assertFalse(result);
    }
}
