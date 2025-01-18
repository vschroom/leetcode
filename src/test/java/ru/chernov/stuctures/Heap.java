package ru.chernov.stuctures;

public class Heap {

    private final Integer[] buffer = new Integer[100_000];
    private int size;

    public void add(int value) {
        if (size == 0) {
            buffer[0] = value;
        } else {
            buffer[size] = value;

            int curIndex = size;
            while (curIndex > 0) {
                int parentIndex = (curIndex - 1) / 2;
                if (buffer[curIndex] != null && buffer[parentIndex] != null && buffer[curIndex] > buffer[parentIndex]) {
                    int tmpValue = buffer[curIndex];
                    buffer[curIndex] = buffer[parentIndex];
                    buffer[parentIndex] = tmpValue;
                }
                curIndex = parentIndex;
            }
        }

        size++;
    }

    public Integer poll() {
        return buffer[0];
    }

    public Integer pop() {
        if (size == 0) {
            return null;
        }

        if (size == 1) {
            return buffer[0];
        }

        // get top
        int head = buffer[0];
        // get last element
        int lastElement = buffer[size - 1];
        // move last to top
        buffer[0] = lastElement;
        // rm last element
        buffer[size - 1] = null;

        int curIndex = 0;
        while (curIndex < size){
            int leftIndex = 2 * curIndex + 1;
            int rightIndex = 2 * curIndex + 2;
            if (buffer[leftIndex] != null && buffer[leftIndex] > buffer[curIndex]) {
                int tmpValue = buffer[leftIndex];
                buffer[leftIndex] = buffer[curIndex];
                buffer[curIndex] = tmpValue;
                curIndex = leftIndex;
            } else if (buffer[rightIndex] != null && buffer[rightIndex] > buffer[curIndex]) {
                int tmpValue = buffer[rightIndex];
                buffer[rightIndex] = buffer[curIndex];
                buffer[curIndex] = tmpValue;
                curIndex = rightIndex;
            } else {
                break;
            }
        }

        size--;

        return head;
    }
}
