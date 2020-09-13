package com.others;

import java.util.HashMap;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/29
 */
public class SolutionMaxProfit {

    //这就是滑动窗口算法（思想）？
    public static int maxProfit(int[] prices) {
        if (prices.length==0) return 0;
        int min=prices[0];
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<min){
                min=prices[i];
            }else if(maxProfit<prices[i]-min){
                maxProfit=prices[i]-min;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums = {7,6,4,3,1};
        System.out.println(maxProfit(nums));
    }
}
