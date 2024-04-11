package ru.chernov.slidingwindow.easy;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future
 * to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSellStock {

    // Общий алгоритм: выбираем минимальный элемент и для каждого след. считаем профит и записываем максимальный.
    // если по ходу, встречается элемент с меньше минимального - заменяем его.
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 1) {
            return 0;
        }

        // берем 1й элемент как минимальный
        int min = prices[0];
        // максимальная прибыль
        int maxProfit = 0;
        for (int i = 1; i < len; i++) {
            // если след. эл. меньше минимального, берем его как min
            if (min > prices[i]) {
                min = prices[i];
            } else {
                // считаем профит с минимальным эл.
                int profit = prices[i] - min;
                // если прибыль больше чем максимально сущ. то заменяем
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}
