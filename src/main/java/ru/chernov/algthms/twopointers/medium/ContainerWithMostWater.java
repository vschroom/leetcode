package ru.chernov.algthms.twopointers.medium;

public class ContainerWithMostWater {

    public int maxArea(int[] h) {
        int len = h.length;
        int l = 0;
        int r = len - 1;
        int max = 0;
        while (l < r) {
            max = Math.max(Math.min(h[l], h[r]) * (r - l), max);
            if (h[l] <= h[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}
