package ru.chernov.medium;

import java.util.Stack;

public class MinStack {

    private final Stack<IntPair> stack;

    public MinStack() {
        this.stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.empty()) {
            stack.push(IntPair.of(val, val));
        } else {
            int currentMin = stack.peek().value;
            int min = Math.min(currentMin, val);
            stack.push(IntPair.of(val, min));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().key;
    }

    public int getMin() {
        return stack.peek().value;
    }

    static class IntPair {
        int key;
        int value;

        public IntPair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        static IntPair of(int key, int value) {
            return new IntPair(key, value);
        }
    }
}
