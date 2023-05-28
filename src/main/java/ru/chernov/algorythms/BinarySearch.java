package ru.chernov.algorythms;

import java.util.Arrays;

public class BinarySearch {

    public int binarySearch(int[] arr, long target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            int cur = arr[mid];
            if (cur == target) {
                return mid;
            } else if (cur < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public int getMax(int[] arr) {
        if (arr.length == 2) {
            return Math.max(arr[0], arr[1]);
        }

        int subMax = getMax(Arrays.copyOfRange(arr, 1, arr.length));

        return Math.max(arr[0], subMax);
    }
}
