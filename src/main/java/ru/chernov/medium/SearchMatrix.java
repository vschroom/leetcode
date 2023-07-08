package ru.chernov.medium;

public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length;
        int left = 0;
        int right = len - 1;
        int mid = (left + right) / 2;

        while (left <= right) {
            int res = search(matrix[mid], target);
            if (res == 0) {
                return true;
            } else if (res == -1) {
                right = mid - 1;
            } else if (res == 1) {
                left = mid + 1;
            } else {
                return false;
            }
            mid = (left + right) / 2;
        }

        return false;
    }

    private int search(int[] arr, int target) {
        int len = arr.length;
        if (target < arr[0]) {
            return -1;
        } else if (target > arr[len - 1]) {
            return 1;
        }

        int left = 0;
        int right = len - 1;
        int mid = (left + right) / 2;

        while (left <= right) {
            int cur = arr[mid];
            if (cur == target) {
                return 0;
            } else if (cur < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }

        return -2;
    }
}
