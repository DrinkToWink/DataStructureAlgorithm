package com.leetcode.weekmatch;

/**
 * @User xiangyl
 * @Data 2020/8/9
 */
public class Solution2 {

    public static void main(String[] args) {
        int n=4,k=11;
        StringBuffer str =new StringBuffer("0");
        for (int i = 1; i < n; i++) {
            StringBuffer str1 =new StringBuffer(invert(str)).reverse();
            str.append("1").append(str1);
        }
        System.out.println(str.charAt(k-1));
    }
    public static String invert(StringBuffer str){
        char[] cha=str.toString().toCharArray();
        for (int i = 0; i < cha.length; i++) {
            if (cha[i]=='1') cha[i]='0';
            else if (cha[i]=='0') cha[i]='1';
        }
        String str1=new String(cha);
        return str1;
    }
}
