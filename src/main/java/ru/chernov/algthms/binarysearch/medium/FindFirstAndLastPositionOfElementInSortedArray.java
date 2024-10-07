package ru.chernov.algthms.binarysearch.medium;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int lo = 0;
        int hi = nums.length - 1;

        int left = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                left = mid;
                hi = mid - 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        lo = left != -1 ? left : 0;
        hi = nums.length - 1;
        int right = -1;
        while (lo < nums.length && lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                right = mid;
                lo = mid + 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return new int[]{left, right};
    }
}
