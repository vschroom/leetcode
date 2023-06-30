package ru.chernov.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvaluateReversePolishNotationTest {

    private final EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();

    @Test
    void test() {
        int result = evaluateReversePolishNotation.evalRevPolNot(new String[]{"2", "1", "+", "3", "*"});

        assertEquals(9, result);
    }

    @Test
    void test2() {
        int result = evaluateReversePolishNotation.evalRevPolNot(new String[]{"4","13","5","/","+"});

        assertEquals(6, result);
    }

    @Test
    void test3() {
        int result = evaluateReversePolishNotation.evalRevPolNotFaster(new String[]{"3","11","+","5","-"});

        assertEquals(9, result);
    }
}
