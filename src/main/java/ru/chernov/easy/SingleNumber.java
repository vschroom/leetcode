package ru.chernov.easy;

import java.util.TreeMap;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if (map.remove(num) == null) {
                map.put(num, num);
            }
        }

        return map.lastKey();
    }

    public int singleNumber2(int[] nums) {
        int ans = 0; // since XOR with 0 returns same number
        for (int num : nums) {
            ans ^= num;  // ans = (ans) XOR (array element at i)
        }
        return ans;
    }
}
