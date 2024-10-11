package ru.chernov.easy;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
