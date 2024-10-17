package ru.chernov.stuctures.stack;

import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class CircularArrayStack<T> implements Iterable<T> {

    Object[] buffer;
    int size;
    int pointer;

    public CircularArrayStack(int size) {
        this.size = size;
        this.buffer = new Object[size];
    }

    public void push(T el) {
        if (pointer == size) {
            throw new IllegalStateException("stack size is over");
        }
        buffer[pointer % size] = el;
        pointer += 1;
    }

    public T pop() {
        if (pointer == 0) {
            throw new IllegalStateException("stack is empty");
        }

        pointer -= 1;
        T retVal = (T) buffer[pointer % size];
        buffer[pointer % size] = null;

        return retVal;
    }

    public T peek() {
        return (T) buffer[pointer - 1];
    }

    public int size() {
        return this.pointer;
    }

    public boolean isEmpty() {
        return this.pointer == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new CircularArrayStackItr();
    }

    private class CircularArrayStackItr implements Iterator<T> {

        int curPointer = 0;

        @Override
        public boolean hasNext() {
            return curPointer < pointer;
        }

        @Override
        public T next() {
            var curValue = buffer[curPointer];
            curPointer += 1;

            return (T) curValue;
        }
    }

    @Override
    public String toString() {
        return "CircularArrayStack{" +
                "buffer=" + Arrays.toString(buffer) +
                ", size=" + size +
                ", pointer=" + pointer +
                '}';
    }
}
