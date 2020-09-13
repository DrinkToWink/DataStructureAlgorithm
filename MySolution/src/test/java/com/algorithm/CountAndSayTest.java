package com.algorithm;

import java.util.Date;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/22
 */
public class CountAndSayTest {

    //递归求解
    public static String countAndSay(int n) {
        StringBuilder newString = new StringBuilder();
        if (n == 1) return "1";
        String preStr = countAndSay(n - 1);
        int m = 0;
        int i = 1;
        for (; i < preStr.length(); i++) {
            if (preStr.charAt(m) != preStr.charAt(i)) {
                int count = i - m;
                newString.append(count).append(preStr.charAt(m));
                m = i;
            }
        }
        //拼接最后一个数字，可能会有多位
        int count = i - m;
        newString = newString.append(count).append(preStr.charAt(m));
        return newString.toString();
    }

    //动态规划法求解,leetcode上面这个方法执行的时间比递归高了一倍，不清楚是咋回事
    public static String countAndSay02(int n){
        if (n==1) {
            return "1";
        }
        StringBuilder stringBuilder = null;
        String preStr="1";
        for (int i = 2; i <= n; i++) {
            int m=0;
            int cur=1;
            stringBuilder=new StringBuilder();
            for (; cur < preStr.length(); cur++) {
                while (preStr.charAt(m)!=preStr.charAt(cur)) {
                    int count=cur-m;
                    stringBuilder.append(count).append(preStr.charAt(m));
                    m=cur;
                }
            }
            int count=cur-m;
            preStr=stringBuilder.append(count).append(preStr.charAt(m)).toString();
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(countAndSay(5));
        //System.out.println(countAndSay02(5));
        long endTime=System.currentTimeMillis();
        System.out.println("执行时间为："+(endTime-startTime));
    }
}
