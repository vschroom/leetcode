package ru.chernov.algthms.hashmap.eazy;

import java.util.HashSet;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (var el : nums) {
            res ^= el;
        }

        return res;
    }

    public int singleNumber2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (var el : nums) {
            if (set.contains(el)) {
                set.remove(el);
            } else {
                set.add(el);
            }
        }

        for (var el : set) {
            return el;
        }

        return 0;
    }
}
