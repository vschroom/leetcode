package ru.chernov.algthms.hashmap.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {

    HashMap<Character, StringBuilder> map = new HashMap<>();
    PriorityQueue<Map.Entry<Character, StringBuilder>> qu =
            new PriorityQueue<>((o1, o2) -> o2.getValue().length() - o1.getValue().length());

    public String frequencySort(String s) {
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            var sb = map.getOrDefault(cur, new StringBuilder());
            sb.append(cur);
            map.put(cur, sb);
        }

        qu.addAll(map.entrySet());

        var res = new StringBuilder();
        while (!qu.isEmpty()) {
            res.append(qu.poll().getValue());
        }

        return res.toString();
    }
}
