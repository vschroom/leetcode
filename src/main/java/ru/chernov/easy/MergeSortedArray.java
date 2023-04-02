package ru.chernov.easy;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copy = Arrays.copyOf(nums1, m);
        int j = 0;
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (j < m && k < n) {
                if (copy[j] < nums2[k]) {
                    nums1[i] = copy[j];
                    j++;
                } else {
                    nums1[i] = nums2[k];
                    k++;
                }
            } else if (j >= m && k < n) {
                nums1[i] = nums2[k];
                k++;
            } else if (j < m) {
                nums1[i] = copy[j];
                j++;
            }
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;
        int b = n - 1;
        for (int i = m + n - 1; b >= 0; i--) {
            if (a >= 0 && nums1[a] > nums2[b]) {
                nums1[i] = nums1[a--];
            } else {
                nums1[i] = nums2[b--];
            }
        }
    }
}
