package ru.chernov.algthms.hashmap.eazy;

import java.util.HashMap;

public class MajorityElement {

    HashMap<Integer, Integer> map = new HashMap<>();
    public int majorityElement(int[] nums) {
        for (int num : nums) {
            int cnt = map.getOrDefault(num, 0);
            cnt += 1;
            if (cnt > nums.length / 2) {
                return num;
            }
            map.put(num, cnt);
        }

        return -1;
    }
}
