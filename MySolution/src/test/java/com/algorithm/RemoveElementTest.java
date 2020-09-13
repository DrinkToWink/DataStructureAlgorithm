package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/21
 */
public class RemoveElementTest {

    public static int removeElement(int[] nums,int val){
        int m=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[m]=nums[i];
                m++;
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
        return m;
    }

    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
    }
}
