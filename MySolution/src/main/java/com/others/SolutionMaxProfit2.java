package com.others;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/29
 */
public class SolutionMaxProfit2 {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                maxProfit = maxProfit + (prices[i] - prices[i - 1]);
            }
        }
        return maxProfit;
    }
}
