package ru.chernov.stuctures.queue;

import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class CircularArrayQueue<T> implements Iterable<T> {

    Object[] buffer;
    int capacity;
    int leftPointer;
    int rightPointer;

    public CircularArrayQueue(int capacity) {
        this.capacity = capacity;
        this.buffer = new Object[capacity];
    }

    public void push(T value) {
        if (leftPointer < rightPointer) {
            throw new IllegalStateException("Queue size is over");
        }

        buffer[leftPointer % capacity] = value;
        leftPointer += 1;
    }

    public T pop() {
        if (rightPointer >= leftPointer) {
            throw new IllegalStateException("Queue is over");
        }

        var retVal = (T) buffer[rightPointer % capacity];
        buffer[rightPointer % capacity] = null;
        rightPointer += 1;

        return retVal;
    }

    public T peek() {
        return (T) buffer[rightPointer % capacity];
    }

    public int size() {
        return Math.abs(leftPointer - rightPointer);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {

            int curPointer = rightPointer;

            @Override
            public boolean hasNext() {
                return curPointer < leftPointer;
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
                ", leftPointer=" + leftPointer +
                ", rightPointer=" + rightPointer +
                '}';
    }
}
