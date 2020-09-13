package com.leetcode.weekmatch;

import java.util.Arrays;

/**
 * @User xiangyl
 * @Data 2020/8/23
 */
public class Solution5 {

    public static void main(String[] args) {
        int[] a={2,4,1,2,7,8};
        System.out.println(maxCoins(a));
    }

    public static int maxCoins(int[] piles){
        Arrays.sort(piles);
        int sum=0;
        int len= piles.length/3;
        int index=piles.length-2;
        for (int i=0;i<len;i++){
            sum+=piles[index];
            index=index-2;
        }
        return sum;
    }
}
