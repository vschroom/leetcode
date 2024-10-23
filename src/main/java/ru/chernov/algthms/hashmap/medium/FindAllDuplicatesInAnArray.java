package ru.chernov.algthms.hashmap.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] st = new int[nums.length + 1];
        for (var el : nums) {
            if (st[el] == 1) {
                res.add(el);
            } else {
                st[el] = 1;
            }
        }

        return res;
    }
}
