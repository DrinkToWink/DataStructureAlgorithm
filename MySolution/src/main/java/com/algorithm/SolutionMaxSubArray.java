package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/20
 */
public class SolutionMaxSubArray {

    public static int maxSubArray(int[] nums) {
        //假设第一个为最大值
        int max = nums[0];
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (sum > 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
            //取出加完下一个之后，跟不加下一个的最大值
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ints={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(ints));
    }
}
