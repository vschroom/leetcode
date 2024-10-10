package ru.chernov.algthms.binarysearch.medium;

/**
 * There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
 * Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such
 * that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
 * For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
 * Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
 * You must decrease the overall operation steps as much as possible.
 */
public class SearchInRotatedSortedArray2 {

    public boolean search(int[] nums, int t) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mi = lo + (hi - lo) / 2;
            if (nums[mi] == t) {
                return true;
            } else if (nums[lo] >= nums[hi]) {
                if (nums[lo] == t) return true;
                lo = lo + 1;
            } else if (nums[mi] > t) {
                hi = mi - 1;
            } else {
                lo = mi + 1;
            }
        }

        return false;
    }
}
