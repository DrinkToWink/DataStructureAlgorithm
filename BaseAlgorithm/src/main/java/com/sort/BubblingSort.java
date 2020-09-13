package com.sort;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/30
 */
public class BubblingSort {

    public static int[] bubblingSort(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (nums[i] > nums[i1]) {
                    temp = nums[i];
                    nums[i] = nums[i1];
                    nums[i1] = temp;

                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {16, 13, 19, 15, 20, 18, 17, 14, 12, 11, 10, 30};
        int[] ints = bubblingSort(nums);
        for (int anInt : ints) {
            System.out.print(anInt + ",");
        }
    }
}
