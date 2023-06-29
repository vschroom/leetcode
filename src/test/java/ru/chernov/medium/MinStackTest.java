package ru.chernov.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {

    @Test
    void test() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        assertEquals(-3, minStack.getMin());
        minStack.pop();

        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.getMin());
    }

    @Test
    void test2() {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);

        assertEquals(0, minStack.getMin());
        minStack.pop();
        assertEquals(0, minStack.getMin());
    }

    @Test
    void test3() {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);

        assertEquals(0, minStack.getMin());
        minStack.pop();
        assertEquals(0, minStack.getMin());
        minStack.pop();
        assertEquals(0, minStack.getMin());
        minStack.pop();
        assertEquals(2, minStack.getMin());
    }
}
