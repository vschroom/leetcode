package ru.chernov.algthms.hashmap.eazy;

import java.util.HashSet;

public class HappyNumber {
    HashSet<Integer> set = new HashSet<>();

    public boolean isHappy(int n) {
        if (n == 1) return true;

        int sum = 0;
        while (n / 10 != 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        sum += Math.pow(n, 2);

        if (set.contains(sum)) {
            return false;
        } else {
            set.add(sum);
        }

        return isHappy(sum);
    }

    public boolean isHappy2(int n) {
        int sum = nextSum(n);
        set.add(sum);
        while (!set.contains(sum)) {
            if (sum == 1) return true;
            int nextSum = nextSum(sum);
            set.add(nextSum);
        }

        return false;
    }

    private int nextSum(int n) {
        int sum = 0;
        while (n / 10 != 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        sum += Math.pow(n, 2);

        return sum;
    }
}
