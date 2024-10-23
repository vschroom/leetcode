package ru.chernov.stuctures.queue;

import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class CircularArrayQueue<T> implements Iterable<T> {

    Object[] buffer;
    int capacity;
    int tailPointer;
    int headPointer;
    int size;

    public CircularArrayQueue(int capacity) {
        this.capacity = capacity;
        this.buffer = new Object[capacity];
    }

    public void push(T value) {
        if (size == capacity) {
            throw new IllegalStateException("Queue size is over");
        }

        buffer[tailPointer % capacity] = value;
        tailPointer += 1;
        size += 1;
    }

    public T pop() {
        if (size == 0) {
            throw new IllegalStateException("Queue is over");
        }

        var retVal = (T) buffer[headPointer % capacity];
        buffer[headPointer % capacity] = null;
        headPointer += 1;
        size -= 1;

        return retVal;
    }

    public T peek() {
        return (T) buffer[headPointer % capacity];
    }

    public int size() {
        return size - 1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {

            int curPointer = headPointer;

            @Override
            public boolean hasNext() {
                return curPointer < tailPointer;
            }

            @Override
            public T next() {
                var retVal = (T) buffer[curPointer % capacity];
                curPointer += 1;

                return retVal;
            }
        };
    }

    @Override
    public String toString() {
        return "CircularArrayQueue{" +
                "buffer=" + Arrays.toString(buffer) +
                ", size=" + capacity +
                ", leftPointer=" + tailPointer +
                ", rightPointer=" + headPointer +
                '}';
    }
}
