package ru.chernov.easy;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> store = new ArrayList<>();
        int[] largeArr;
        int[] shortArr;
        if (nums1.length <= nums2.length) {
            shortArr = nums1;
            largeArr = nums2;
        } else {
            shortArr = nums2;
            largeArr = nums1;
        }

        for (int j : shortArr) {
            int val = map.getOrDefault(j, 0);
            map.put(j, ++val);
        }

        for (int cur : largeArr) {
            if (map.containsKey(cur)) {
                int val = map.get(cur);
                if (val != 0) {
                    map.put(cur, --val);
                    store.add(cur);
                }
            }
        }

        int[] res = new int[store.size()];
        int k = 0;
        for (var el : store) {
            res[k] = el;
            k++;
        }

        return res;
    }
}
