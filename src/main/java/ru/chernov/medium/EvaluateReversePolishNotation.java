package ru.chernov.medium;

import java.util.Map;
import java.util.Stack;
import java.util.function.BiFunction;

public class EvaluateReversePolishNotation {

    public int evalRevPolNot(String[] tokens) {
        Map<String, BiFunction<Integer, Integer, Integer>> operators = Map.of(
                "-", (a, b) -> a - b,
                "+", Integer::sum,
                "*", (a, b) -> a * b,
                "/", (a, b) -> a / b
        );
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (String el : tokens) {
            if (operators.containsKey(el)) {
                int first = stack.pop();
                int sec = stack.pop();
                res = operators.get(el).apply(sec, first);
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(el));
            }
        }

        return stack.isEmpty() ? res : stack.pop();
    }

    public int evalRevPolNotFaster(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (String el : tokens) {
            switch(el) {
                case "-" -> {
                    int first = stack.pop();
                    int sec = stack.pop();
                    res = sec - first;
                    stack.push(res);
                }
                case "+" -> {
                    int first = stack.pop();
                    int sec = stack.pop();
                    res = sec + first;
                    stack.push(res);
                }
                case "/" -> {
                    int first = stack.pop();
                    int sec = stack.pop();
                    res = sec / first;
                    stack.push(res);
                }
                case "*" -> {
                    int first = stack.pop();
                    int sec = stack.pop();
                    res = sec * first;
                    stack.push(res);
                }
                default -> stack.push(Integer.parseInt(el));
            }
        }

        return stack.isEmpty() ? res : stack.pop();
    }
}
