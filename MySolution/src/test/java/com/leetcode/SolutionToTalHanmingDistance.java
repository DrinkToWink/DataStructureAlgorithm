package com.leetcode;

import java.util.concurrent.CountDownLatch;

/**
 * @User xiangyl
 * @Data 2021/5/28
 */
public class SolutionToTalHanmingDistance {


    public static void main(String[] args) {
        /*int[] nums={14,4,2};
        System.out.println(totalHammingDistance(nums));*/
        System.out.println(2>>1);
        System.out.println((2 >> 0) & 1);
    }

    public static int totalHammingDistance(int[] nums) {
        int coutn = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                coutn += getNum(nums[i], nums[j]);
            }
        }
        return coutn;
    }

    public static int getNum(int a, int b) {
        return Integer.bitCount(a ^ b);
    }


    public static int totalHammingDistance2(int[] nums) {
        int count = 0;
        int length = nums.length;
        for (int i = 0; i < 30; i++) {
            int c = 0;
            for (int num : nums) {
                c += (num >> i) & 1;
            }
            count += (length - c) * c;
        }
        return count;
    }

}
