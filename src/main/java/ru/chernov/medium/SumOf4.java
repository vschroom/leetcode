package ru.chernov.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
 * 0 <= a, b, c, d < n
 * a, b, c, and d are distinct.
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * You may return the answer in any order.
 */
public class SumOf4 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int k = j + 1;
                int m = nums.length - 1;

                while (k < m) {
                    long sum = ((long) nums[i]) + nums[j] + nums[k] + nums[m];
                    if (target == sum) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[m]));

                        while (k < m && nums[k] == nums[k + 1]) {
                            k++;
                        }
                        while (k < m && nums[m] == nums[m - 1]) {
                            m--;
                        }
                        k++;
                        m--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        m--;
                    }
                }
                while (j < nums.length - 2 && nums[j] == nums[j + 1]) {
                    j++;
                }
            }
            while (i < nums.length - 3 && nums[i] == nums[i + 1]) {
                i++;
            }
        }

        return res;
    }
}
