package ru.chernov.algthms.hashmap.eazy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 */
public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] numsCopy = new int[nums.length];
        for (int num : nums) {
            numsCopy[num - 1] = 1;
        }

        var res = new ArrayList<Integer>();
        for (int i = 0; i < numsCopy.length; i++) {
            if (numsCopy[i] != 1) {
                res.add(i + 1);
            }
        }

        return res;
    }
}
