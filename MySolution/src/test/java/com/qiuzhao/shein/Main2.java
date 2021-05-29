package com.qiuzhao.shein;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/11/25
 */
public class Main2 {

    public int Length(String str1, String str2){
        if(str1 == null || str2 ==null || str1.length() < str2.length()){
            return 0;
        }
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        int[] ints = new int[256];
        for (int i=0; i< char2.length; i++){
            ints[char2[i]]++;
        }
        int le= 0;
        int ri = 0;
        int min =Integer.MAX_VALUE;
        int len2 =char2.length;
        while (ri != char1.length){
            ints[char1[ri]]--;
            if(ints[char1[ri]] >= 0){
                len2--;
            }
            if(len2 == 0){
                while (ints[char1[le]] < 0){
                    ints[char1[le++]]++;
                }
                min = Math.min(min, ri - le + 1);
                len2++;
                ints[char1[le++]]++;
            }
            ri++;
        }
        return min == Integer.MAX_VALUE ? 0 :min;
    }

    public static void main(String[] args){
        Main2 tmp = new Main2();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(tmp.Length(str1, str2));
    }
}
