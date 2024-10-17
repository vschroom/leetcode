package ru.chernov.stuctures;

import org.junit.jupiter.api.Test;
import ru.chernov.stuctures.stack.CircularArrayStack;
import ru.chernov.stuctures.stack.CustomStack;

import java.util.Iterator;

class StackTest {

    @Test
    void circularStackTest() {
        CircularArrayStack<Integer> stack = new CircularArrayStack<>(5);

        stack.push(1);
        System.out.println(stack);
        stack.push(2);
        System.out.println(stack);
        stack.push(3);
        System.out.println(stack);
        stack.push(4);
        System.out.println(stack);
        stack.push(5);
        System.out.println(stack);
        var popped = stack.pop();
        System.out.println(stack);
        System.out.println(popped);
        stack.pop();
        stack.pop();
//        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack);
//        stack.push(4);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());

        while (stack.size() != 5) {
            stack.push(10);
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            stack.pop();
        }
        System.out.println(stack);
        stack.push(1);
        System.out.println(stack);

        stack.push(54);
        stack.push(null);
        stack.push(454);
        stack.push(543);
//        stack.push(43);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
//        stack.pop();

        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
            System.out.printf(it.next() + " ");
        }
        System.out.println();
    }

    @Test
    void linkedStackTest() {
        CustomStack<Integer> stack = new CustomStack<>();

        System.out.println(stack.size());
        stack.push(29);
        stack.push(30);
        stack.push(31);
        stack.push(32);
        stack.push(33);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.size());

        /*stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();*/
        System.out.println("size: " + stack.size());

//        stack.pop();

        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
            System.out.printf(it.next() + " ");
        }
        System.out.println();
        System.out.println("is empty ? " + stack.isEmpty());
    }
}
