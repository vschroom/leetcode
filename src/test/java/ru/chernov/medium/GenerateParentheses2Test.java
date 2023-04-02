package ru.chernov.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateParentheses2Test {

    private final GenerateParentheses2 generateParentheses2 = new GenerateParentheses2();

    @Test
    void test() {
        var result = generateParentheses2.generateParenthesis(1);

        assertEquals(List.of("()"), result);
    }

    @Test
    void test2() {
        var result = generateParentheses2.generateParenthesis(3);

        assertEquals(List.of("((()))", "(()())", "(())()", "()(())", "()()()"), result);
    }
}
