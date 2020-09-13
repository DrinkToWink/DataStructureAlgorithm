package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/22
 */
public class SolutionPlusOne {

    public static int[] plusOne(int[] digits){
        for (int i = digits.length-1; i >=0; i--) {
            digits[i]++;
            if (digits[i]%10!=0){
                return digits;
            }else {
                digits[i]=0;
            }
        }
        digits = new int[digits.length + 1];
        digits[0]=1;
        return digits;
    }

    public static void main(String[] args) {
        int[] nums={1,9,9,8};
        int[] ints = plusOne(nums);
        for (int anInt : ints) {
            System.out.print(anInt+"");
        }
    }
}
