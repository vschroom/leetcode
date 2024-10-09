package ru.chernov.algthms.binarysearch.medium;

public class SearchIn2dMatrix2 {

    // O(n + log(m))
    public boolean searchMatrix(int[][] m, int t) {
        for (int[] ints : m) {
            int lo = 0;
            int hi = ints.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (ints[mid] == t) {
                    return true;
                } else if (ints[mid] > t) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }

        return false;
    }

    // O(m + n)
    public boolean searchMatrix2(int[][] m, int t) {
        int j = m[0].length - 1;
        int i = 0;
        while (i >= 0 && j <= m[0].length) {
            if (m[i][j] == t) {
                return true;
            } else if (m[i][j] < t) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }
}
