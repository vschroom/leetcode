package ru.chernov.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateParentheses1Test {

    private final GenerateParentheses1 generateParentheses1 = new GenerateParentheses1();

    @Test
    void test() {
        var result = generateParentheses1.generateParenthesis(1);

        assertEquals(List.of("()"), result);
    }

    @Test
    void test2() {
        var result = generateParentheses1.generateParenthesis(3);

        assertEquals(List.of("((()))", "(()())", "(())()", "()(())", "()()()"), result);
    }
}
