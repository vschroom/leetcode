package ru.chernov.algthms.slidingwindow.easy;

public class MaxAverageSubArray {

    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1) {
            return nums[0];
        }

        double cur = 0;
        double maxSum = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            if (r < k) {
                cur += nums[r];
                if (r == k - 1) {
                    maxSum = cur;
                }
            } else {
                cur = cur + nums[r] - nums[l];
                maxSum = Math.max(cur, maxSum);
                l++;
            }
        }

        return maxSum / k;
    }
}
