package ru.chernov.stuctures.stack;

import java.util.Iterator;

public class CustomStack<T> implements Iterable<T> {

    final Node tailNode = new Node();
    final Node headNode = new Node();

    int elementCount;

    public CustomStack() {
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
            throw new IllegalStateException("Stack is over");
        }

        Node firstNode = headNode.prev;
        headNode.prev = firstNode.prev;
        firstNode.prev.next = headNode;

        firstNode.prev = null;
        firstNode.next = null;

        elementCount--;

        return firstNode.value;
    }

    public T peek() {
        return headNode.prev.value;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomStackIterator();
    }

    public long size() {
        return elementCount;
    }

    public boolean isEmpty() {
        return elementCount == 0;
    }

    private class CustomStackIterator implements Iterator<T> {

        private Node currentNode = headNode;

        @Override
        public boolean hasNext() {
            return currentNode.prev != tailNode && currentNode.prev != null;
        }

        @Override
        public T next() {
            var cur = currentNode.prev;
            currentNode = cur;

            return cur.value;
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
