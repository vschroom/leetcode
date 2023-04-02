package ru.chernov.easy;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] res = new int[len];
        boolean isPlus = true;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] == 9 && isPlus) {
                if (i > 0) {
                    res[i] = 0;
                } else {
                    res = new int[len + 1];
                    res[i + 1] = 0;
                    res[i] = 1;
                }
            } else if (isPlus) {
                res[i] = digits[i] + 1;
                isPlus = false;
            } else {
                res[i] = digits[i];
            }
        }
        return res;
    }

    public int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;
    }
}
