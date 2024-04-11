package ru.chernov.slidingwindow.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    void test1() {
        int result = bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4});

        assertEquals(5, result);
    }

    @Test
    void test2() {
        int result = bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1});

        assertEquals(0, result);
    }
}
