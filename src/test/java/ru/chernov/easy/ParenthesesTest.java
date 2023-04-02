package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParenthesesTest {

    private final Parentheses parentheses = new Parentheses();

    @Test
    void test() {
        assertTrue(parentheses.isValid("()"));
    }

    @Test
    void test2() {
        assertFalse(parentheses.isValid(")(){}"));
    }

    @Test
    void test3() {
        assertTrue(parentheses.isValid("([])"));
    }

    @Test
    void test4() {
        assertFalse(parentheses.isValid("(("));
    }

    @Test
    void test5() {
        assertFalse(parentheses.isValid(")"));
    }

    @Test
    void test6() {
        assertFalse(parentheses.isValid("[])"));
    }
}
