package ru.chernov.easy;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {

    // Fibonacci sequence
    public int climb(int n) {
        int i = 0;
        int j = 1;
        for (int k = 1; k < n; k++) {
            int temp = j;
            j += i;
            i = temp;
        }

        return i + j;
    }
}
