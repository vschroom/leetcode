package ru.chernov.stuctures.queue;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class CircularArrayQueue<T> {

    Object[] buffer;
    int size;
    int leftPointer;
    int rightPointer;

    public CircularArrayQueue(int size) {
        this.size = size;
        this.buffer = new Object[size];
    }

    public void push(T value) {
        if (leftPointer < rightPointer) {
            throw new IllegalStateException("Queue size is over");
        }

        buffer[leftPointer % size] = value;
        leftPointer += 1;
    }

    public T pop() {
        if (rightPointer >= leftPointer) {
            throw new IllegalStateException("Queue is over");
        }

        var retVal = (T) buffer[rightPointer % size];
        buffer[rightPointer % size] = null;
        rightPointer += 1;

        return retVal;
    }

    public T peek() {
        return (T) buffer[rightPointer % size];
    }

    public int size() {
        return Math.abs(leftPointer - rightPointer);
    }

    public boolean isEmpty() {
        return rightPointer > leftPointer;
    }

    @Override
    public String toString() {
        return "CircularArrayQueue{" +
                "buffer=" + Arrays.toString(buffer) +
                ", size=" + size +
                ", leftPointer=" + leftPointer +
                ", rightPointer=" + rightPointer +
                '}';
    }
}
