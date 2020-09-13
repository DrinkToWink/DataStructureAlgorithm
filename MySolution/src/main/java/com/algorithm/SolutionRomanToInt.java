package com.algorithm;

import java.util.HashMap;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/17
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。
 * 但也存在特例，例如 4 不写做 IIII，而是 IV。
 * 数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
 * 同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * <p>
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 */
public class SolutionRomanToInt {

    //使用HashMap来存放，查询较慢，可以进一步优化
    public static int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        char[] chars = s.toCharArray();
        Integer[] nums = new Integer[s.length()];
        int result = 0;
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        for (int i = 0; i < chars.length; i++) {
            Integer num = map.get(String.valueOf(chars[i]));
            nums[i] = num;
        }
        int preNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (preNum >= nums[i]) {
                result = result + preNum;
            } else {
                result = result - preNum;
            }
            preNum = nums[i];
        }
        result+=preNum;
        return result;
    }

    //使用switch来判断，效率比较高
    public static int romanToInt02(String s) {
        int preNum = change(s.charAt(0));
        int sum=0;
        int cur=0;
        for (int i=1;i<s.length();i++){
            cur=change(s.charAt(i));
            if (preNum>cur){
                sum+=preNum;
            }else {
                sum-=preNum;
            }
            preNum=cur;
        }
        return sum+cur;
    }

    public static int change(char s){
        switch (s){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt( "MCMXCIV"));
        System.out.println(romanToInt02("MCMXCIV"));
    }
}
