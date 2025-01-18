package ru.chernov.stuctures;

import org.junit.jupiter.api.Test;

public class PriorityQueueTest {

    @Test
    void test() {
        Heap heap = new Heap();
        heap.add(1);
        heap.add(4);
        heap.add(8);
        heap.add(2);
        heap.add(10);
        heap.add(3);
        heap.add(6);
        heap.add(1);
        heap.add(20);
        System.out.println(heap.poll());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.poll());
        heap.add(12);
        System.out.println(heap.poll());
    }
}
