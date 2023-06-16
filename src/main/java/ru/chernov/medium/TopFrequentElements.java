package ru.chernov.medium;

import java.util.*;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 */
public class TopFrequentElements {

    public int[] topFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequentMap = new HashMap<>();
        for (int num : nums) {
            int frequency = frequentMap.getOrDefault(num, 1);
            frequentMap.put(num, ++frequency);
        }

        Comparator<Map.Entry<Integer, Integer>> comparator = Map.Entry.comparingByValue();
        PriorityQueue<Map.Entry<Integer, Integer>> distinctHeap = new PriorityQueue<>(comparator.reversed());
        distinctHeap.addAll(frequentMap.entrySet());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = Objects.requireNonNull(distinctHeap.poll()).getKey();
        }

        return result;
    }
}
