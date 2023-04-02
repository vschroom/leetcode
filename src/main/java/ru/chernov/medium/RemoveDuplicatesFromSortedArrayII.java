package ru.chernov.medium;

public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        int prev = 0;
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[prev] == nums[i] && temp == 0) {
                nums[++prev] = nums[i];
                temp++;
            } else if (nums[prev] != nums[i]) {
                nums[++prev] = nums[i];
                temp = 0;
            }
        }
        return prev + 1;
    }

    public int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n != nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}
