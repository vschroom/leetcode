package ru.chernov.stuctures.stack;

import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class CircularArrayStack<T> implements Iterable<T> {

    Object[] buffer;
    int size;
    int pointer = -1;

    public CircularArrayStack(int size) {
        this.size = size;
        this.buffer = new Object[size];
    }

    public void push(T el) {
        if (pointer == size) {
            throw new IllegalStateException("stack size is over");
        }
        int inc = ++pointer;
        buffer[inc % size] = el;
    }

    public T pop() {
        if (pointer < 0) {
            throw new IllegalStateException("stack is empty");
        }
        T retVal = (T) buffer[pointer];
        buffer[pointer] = null;
        pointer--;

        return retVal;
    }

    public T peek() {
        return (T) buffer[pointer];
    }

    public int size() {
        return this.pointer + 1;
    }

    public boolean isEmpty() {
        return this.pointer == -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new CircularArrayStackItr();
    }

    private class CircularArrayStackItr implements Iterator<T> {

        int curPointer = -1;

        @Override
        public boolean hasNext() {
            return curPointer + 1 != size && buffer[curPointer + 1] != null;
        }

        @Override
        public T next() {
            curPointer += 1;
            var curValue = buffer[curPointer];

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
