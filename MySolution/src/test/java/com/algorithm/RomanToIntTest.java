package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/21
 */
public class RomanToIntTest {

    public static int romanToInt(String s){
        int pre=reverse(s.charAt(0));
        int result=0;
        for (int i = 1; i < s.length(); i++) {
            if (pre>reverse(s.charAt(i))){
                result=result+pre;
            }else {
                result=result-pre;
            }
            pre=reverse(s.charAt(i));
        }
        return result+pre;
    }

    public static int reverse(char s){
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
        System.out.println(romanToInt("MCMXCIV"));
    }
}
