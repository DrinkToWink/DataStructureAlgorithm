package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/22
 */
public class MaxSubArrayTest {

    public static int maxSubArray(int[] nums) {
        int curMax=nums[0];
        int sumMax=0;
        for (int num : nums) {
            if (sumMax>0){
                sumMax+=num;
            }else {
                sumMax=num;
            }
            curMax = Math.max(curMax, sumMax);
        }
        return curMax;
    }

    public static void main(String[] args) {
        int[] ints={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(ints));
    }
}
