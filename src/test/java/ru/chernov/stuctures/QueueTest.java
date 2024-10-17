package ru.chernov.stuctures;

import org.junit.jupiter.api.Test;
import ru.chernov.stuctures.queue.CircularArrayQueue;
import ru.chernov.stuctures.queue.CustomQueue;

import java.util.Iterator;

class QueueTest {

    @Test
    void test() {
        CustomQueue<Integer> queue = new CustomQueue<>();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek());
        System.out.println(queue.size());

        while (!queue.isEmpty()) {
            System.out.print("popped: " + queue.pop() + " ");
        }
        System.out.println();
        System.out.println(queue.size());

        for (int i = 0; i < 15; i++) {
            queue.push(i);
        }

        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            System.out.println("peek: " + it.next());
        }
    }

    @Test
    void test2() {
        var queue = new CircularArrayQueue<Integer>(20);

        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek());
//        System.out.println(queue.size());

        /*while (!queue.isEmpty()) {
            System.out.print("popped: " + queue.pop() + " ");
        }*/
        System.out.println();
//        System.out.println(queue.size());

        for (int i = 0; i < 17; i++) {
            queue.push(i);
        }

        System.out.println("s: " + queue.size());

        queue.push(132);
        System.out.println(queue);
        for (int i = 0; i < 15; i++) {
            queue.pop();
        }
        System.out.println("s: " + queue.size());

        System.out.println(queue);
        for (int i = 0; i < 10; i++) {
            queue.push(i);
        }
        System.out.println(queue);

        for (int i = 0; i < 6; i++) {
            System.out.println(queue.pop());
        }
        System.out.println(queue);
        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            System.out.println("peek: " + it.next());
        }
    }
}
