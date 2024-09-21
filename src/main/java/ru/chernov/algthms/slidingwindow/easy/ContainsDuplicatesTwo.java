package ru.chernov.algthms.slidingwindow.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums and an integer k,
 * return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 */
public class ContainsDuplicatesTwo {

    private final Set<Integer> store = new HashSet<>();

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        store.add(nums[0]);
        for (int r = 1, l = 0; r < nums.length; ) {
            if(Math.abs(l - r) <= k) {
                if (!store.add(nums[r])) {
                    return true;
                }
                r++;
            } else {
                store.remove(nums[l]);
                l++;
            }
        }

        return false;
    }
}
