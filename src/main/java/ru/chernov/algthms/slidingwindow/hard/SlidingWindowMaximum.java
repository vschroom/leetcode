package ru.chernov.algthms.slidingwindow.hard;

import java.util.ArrayDeque;

public class SlidingWindowMaximum {

    private final ArrayDeque<Integer> dq = new ArrayDeque<>();

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];

            while (!dq.isEmpty() && dq.getLast() < cur) {
                dq.pollLast();
            }

            dq.addLast(cur);

            if (i >= k && nums[i - k] == dq.getFirst()) {
                dq.pollFirst();
            }

            if (i >= k - 1) {
                res[n] = dq.getFirst();
                n++;
            }
        }

        return res;
    }
}
