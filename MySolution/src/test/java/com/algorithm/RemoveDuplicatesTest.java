package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/21
 */
public class RemoveDuplicatesTest {

    public static int removeDuplicates(int[] nums){
        int m=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[m]!=nums[i]){
                m++;
                nums[m]=nums[i];
            }
        }
        return m+1;
    }

    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println();
        System.out.print(removeDuplicates(nums));
    }
}
