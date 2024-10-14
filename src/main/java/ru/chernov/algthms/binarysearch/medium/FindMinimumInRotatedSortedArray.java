package ru.chernov.algthms.binarysearch.medium;

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
         if (nums[lo] < nums[hi]) {
             return nums[lo];
         }

         while (nums[lo] > nums[hi]) {
             int mi = lo + (hi - lo) / 2;
             if (nums[mi] > nums[hi]) {
                 lo = mi + 1;
             } else {
                 lo = lo + 1;
             }
         }

         return nums[lo];
    }

    public int findMin2(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (nums[mi] < nums[hi]) {
                hi = mi;
            } else {
                lo = mi + 1;
            }
        }

        return nums[lo];
    }
}
