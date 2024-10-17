package ru.chernov.stuctures.queue;

import java.util.Iterator;

public class CustomQueue<T> implements Iterable<T> {

    final Node tailNode = new Node();

    final Node headNode = new Node();

    int elementCount;

    public CustomQueue() {
        headNode.prev = tailNode;
        tailNode.next = headNode;
    }

    public void push(T el) {
        Node prevNode = headNode.prev;
        Node newNode = new Node(el, prevNode, headNode);
        headNode.prev = newNode;
        prevNode.next = newNode;

        elementCount++;
    }

    public T pop() {
        if (elementCount == 0) {
            throw new IllegalStateException("Queue is over");
        }

        Node lastNode = tailNode.next;
        tailNode.next = lastNode.next;
        lastNode.next.prev = tailNode;

        lastNode.prev = null;
        lastNode.next = null;

        elementCount--;

        return lastNode.value;
    }

    public T peek() {
        return tailNode.next.value;
    }

    public int size() {
        return elementCount;
    }

    public boolean isEmpty() {
        return elementCount == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomQueueItr();
    }

    private class CustomQueueItr implements Iterator<T> {

        private Node currentNode = tailNode;

        @Override
        public boolean hasNext() {
            return currentNode.next != headNode;
        }

        @Override
        public T next() {
            var next = currentNode.next;
            currentNode = next;

            return next.value;
        }
    }

    private class Node {
        T value;
        Node prev;
        Node next;

        public Node() {
        }

        public Node(T value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
