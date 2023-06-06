package ru.chernov.easy;

/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int len = nums.length;
        int summ = len * (len + 1) / 2;

        for (int num : nums) {
            summ -= num;
        }

        return summ;
    }
}
