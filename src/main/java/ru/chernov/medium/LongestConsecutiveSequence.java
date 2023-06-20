package ru.chernov.medium;

import java.util.PriorityQueue;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int el : nums) {
            priorityQueue.add(el);
        }

        int prev = Integer.MIN_VALUE;
        int count = 0;
        int max = 0;
        while (priorityQueue.peek() != null) {
            int el = priorityQueue.poll();

            if (Math.abs(el - prev) == 1) {
                count++;
                prev = el;
            } else if (prev != el) {
                max = Math.max(max, count);
                count = 1;
                prev = el;
            }
        }

        return Math.max(max, count);
    }
}
