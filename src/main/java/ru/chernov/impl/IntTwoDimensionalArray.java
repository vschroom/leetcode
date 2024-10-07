package ru.chernov.impl;

public class IntTwoDimensionalArray {

    int[] arr;
    int iLength;
    int jLength;

    public IntTwoDimensionalArray(int iLength, int jLength) {
        this.iLength = iLength;
        this.jLength = jLength;
        this.arr = new int[iLength * jLength];
    }

    public void add(int i, int j, int value) {
        arr[computeIndex(i, j)] = value;
    }

    public int get(int i, int j) {
        return arr[computeIndex(i, j)];
    }

    private int computeIndex(int i, int j) {
        int offset = j * iLength;
        return i + offset;
    }
}
