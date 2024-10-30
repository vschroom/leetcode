package ru.chernov.easy;

import java.util.TreeSet;

import static java.util.Objects.requireNonNull;

/**
 * Given an integer array nums, return the third distinct maximum number in this array.
 * If the third maximum does not exist, return the maximum number.
 */
public class ThirdMaximumNumber {

    TreeSet<Integer> treeSet = new TreeSet<>();

    public int thirdMax(int[] nums) {
        for (int num : nums) {
            treeSet.add(num);
            if (treeSet.size() > 3) {
                treeSet.pollFirst();
            }
        }

        return treeSet.size() >= 3 ? requireNonNull(treeSet.pollFirst()) : requireNonNull(treeSet.pollLast());
    }
}
