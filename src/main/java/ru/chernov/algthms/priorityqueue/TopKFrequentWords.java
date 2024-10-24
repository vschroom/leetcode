package ru.chernov.algthms.priorityqueue;

import java.util.*;

public class TopKFrequentWords {

    HashMap<String, Integer> map = new HashMap<>();
    PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((s1, s2) -> {
        if (s1.getValue().equals(s2.getValue())) {
            return s1.getKey().compareTo(s2.getKey());
        } else if (s1.getValue() > s2.getValue()) {
            return -1;
        } else {
            return 1;
        }
    });

    public List<String> topKFrequent(String[] words, int k) {
        for (var w : words) {
            int cnt = map.getOrDefault(w, 0);
            map.put(w, ++cnt);
        }

        pq.addAll(map.entrySet());

        List<String> res = new ArrayList<>();
        while (k != 0) {
            res.add(Objects.requireNonNull(pq.poll()).getKey());
            k--;
        }

        return res;
    }
}
