package com.others;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/30
 */
public class SolutionSingleNumber {

    public static int singleNumber(int[] nums){
        LinkedList<Integer> integers = new LinkedList<Integer>();
        for (int num : nums) {
            if (integers.contains(num)) {
                integers.remove((Object)num);
            }else {
                integers.add(num);
            }
        }
        return integers.poll();
    }

    //异或运算：两个数相同结果为0，两个数不同结果为1，所以0异或任何数都是它本身
    //两个相同的数进行异或运算结果为0
    public static int singleNumber2(int[] nums){
        int result=0;
        for (int num : nums) {
            return result=result^num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        //System.out.println(singleNumber(nums));
        System.out.println(singleNumber2(nums));
    }
}
