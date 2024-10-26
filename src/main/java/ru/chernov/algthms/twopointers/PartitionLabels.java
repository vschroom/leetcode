package ru.chernov.algthms.twopointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels {

    HashMap<Character, Integer> map = new HashMap<>();

    public List<Integer> partitionLabels(String s) {
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        List<Integer> res = new ArrayList<>();
        int maxPartLen = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            maxPartLen = Math.max(maxPartLen, map.get(s.charAt(i)));
            if (i == maxPartLen) {
                res.add(i - j + 1);
                j = i + 1;
            }
        }

        return res;
    }
}
