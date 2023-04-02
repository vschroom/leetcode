package ru.chernov.easy;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class BinarySum {

    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            var temp = a;
            a = b;
            b = temp;
        }

        var sb = new StringBuilder();
        var temp = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0; i--, j--) {
            int num1 = Character.getNumericValue(a.charAt(i));
            int num2;
            if (j >= 0) {
                num2 = Character.getNumericValue(b.charAt(j));
            } else {
                num2 = 0;
            }

            switch (num1 + num2 + temp) {
                case (3) -> {
                    temp = 1;
                    sb.append(1);
                }
                case (2) -> {
                    temp = 1;
                    sb.append(0);
                }
                case (1) -> {
                    temp = 0;
                    sb.append(1);
                }
                default -> {
                    temp = 0;
                    sb.append(0);
                }
            }
        }

        if (temp == 1) {
            sb.append(temp);
        }

        return sb.reverse().toString();
    }

}
