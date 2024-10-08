package ru.chernov.algthms.binarysearch.easy;

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }

        long hi = num / 2;
        while (hi * hi > num) {
            hi /= 2;
        }

        long lo = hi;
        hi *= 2;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return false;
    }
}
