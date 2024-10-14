package ru.chernov.stuctures.buffer;

import java.util.Arrays;

public class IntCircularBuffer {

    int[] buffer;
    int size;
    int pointer;

    public IntCircularBuffer(int size) {
        this.size = size;
        this.buffer = new int[size];
    }

    public void add(int value) {
        buffer[pointer % size] = value;
        pointer++;
        if (pointer == size) {
            pointer = 0;
        }
    }

    public int get(int index) {
        return buffer[index];
    }

    @Override
    public String toString() {
        return "IntCircularBuffer{" +
                "buffer=" + Arrays.toString(buffer) +
                '}';
    }
}
