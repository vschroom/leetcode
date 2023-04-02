package ru.chernov.easy;

/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 * You must not use any built-in exponent function or operator.
 */
public class Sqrt {

    public int mySqrt(int x) {
        if (x == 0) return 0;

        int left = 1;
        int right = x;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (x / mid == mid) {
                return mid;
            } else if (x / mid > mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
