package ru.chernov.algthms.binarysearch.medium;

public class SearchIn2dMatrix {

    public boolean searchMatrix(int[][] m, int target) {
        int lo = 0;
        int hi = m.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target == m[mid][0]) {
                return true;
            } else if (target < m[mid][0]) {
                hi = mid - 1;
            } else if (target > m[mid][m[mid].length - 1]) {
                lo = mid + 1;
            } else {
                int l = 0;
                int r = m[mid].length - 1;
                while (l <= r) {
                    int mi = l + (r - l) / 2;
                    if (target == m[mid][mi]) {
                        return true;
                    } else if (target < m[mid][mi]) {
                        r = mi - 1;
                    } else {
                        l = mi + 1;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
