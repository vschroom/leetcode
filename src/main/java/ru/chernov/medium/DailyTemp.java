package ru.chernov.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i]
 * is the number of days you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 */
public class DailyTemp {

    Deque<Integer> stack = new ArrayDeque<>();

    public int[] dailyTemperatures(int[] temps) {
        int len = temps.length;
        if (len == 1) {
            return new int[0];
        }

        int[] res = new int[len];
        stack.push(0);
        for (int i = 1; i < len; i++) {
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) { // если значение в стэке меньше чем текущее, то дастаем из стека и записывам разницу индексов.
                var popped = stack.pop();
                res[popped] = i - popped;
            }
            stack.push(i);
        }

        return res;
    }

}
