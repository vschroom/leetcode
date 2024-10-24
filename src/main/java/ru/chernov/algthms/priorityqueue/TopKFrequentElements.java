package ru.chernov.algthms.priorityqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    HashMap<Integer, Integer> map = new HashMap<>();
    PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((e1, e2) -> {
        if (e1.getValue().equals(e2.getValue())) {
            return 0;
        } else if (e1.getValue() > e2.getValue()) {
            return -1;
        } else {
            return 1;
        }
    });

    public int[] topKFrequent(int[] nums, int k) {
        for (var el : nums) {
            int cnt = map.getOrDefault(el, 0);
            cnt += 1;
            map.put(el, cnt);
        }

        pq.addAll(map.entrySet());

        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = Objects.requireNonNull(pq.poll()).getKey();
        }

        return res;
    }
}
