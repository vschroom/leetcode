package ru.chernov.medium;

public class ReverseInteger {

    public int reverse(int x) {
        boolean sign = false;
        if (x < 0) {
            sign = true;
            x = x * (-1);
        }

        long res = 0;
        while (x / 10 != 0) {
            res = (x % 10 + res) * 10;
            x /= 10;
        }
        res = x % 10 + res;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }

        return (int ) (sign ? res * -1 : res);
    }
}
