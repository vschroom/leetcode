package ru.chernov.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * Assume that each input would have exactly one solution, and you may not use the same element twice.
 * Return the answer in any order.
 */
public class TwoSum {

    /**
     * Первое решение.
     *
     * @param nums Массив целых чисел.
     * @param target Сумма 2-х целых чисел.
     * @return Массив из двух индексов.
     */
    public int[] twoSumByDirect(int[] nums, int target) {
        for (int i = 0; i < nums.length;  i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * Второе решение.
     *
     * @param nums Массив целых чисел.
     * @param target Сумма 2-х целых чисел.
     * @return Массив из двух индексов.
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> store = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            var difference = target - nums[i];
            if (store.containsKey(difference)) {
                return new int[] {i, store.get(difference)};
            }
            store.put(nums[i], i);
        }
        return new int[0];
    }
}
