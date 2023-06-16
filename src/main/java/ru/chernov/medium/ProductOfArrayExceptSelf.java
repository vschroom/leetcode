package ru.chernov.medium;

import java.util.Arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements
 * of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res, 1);

        int mult = 1;
        for (int i = 1; i < len; i++) {
            int cur = nums[i - 1];
            mult *= cur;
            res[i] = mult;
        }

        mult = 1;
        for (int i = len - 1; i >= 0; i--) {
            res[i] = mult * res[i];
            mult *= nums[i];
        }

        return res;
    }

    public int[] productExceptSelfUseDivision(int[] nums) {
        int zeroCount = 0;
        int zeroIndex = 0;
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ++zeroCount;
                if (zeroCount > 1) {
                    return new int[nums.length];
                }
                zeroIndex = i;
            } else {
                prod *= nums[i];
            }
        }

        if (zeroCount == 1) {
            int[] res = new int[nums.length];
            res[zeroIndex] = prod;
            return res;
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = prod / nums[i];
        }

        return res;
    }
}
