package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/20
 */
public class CommenStrTest {

    public static String commonStr(String[] s){
        String preStr=s[0];
        for (int i = 1; i < s.length; i++) {
            //防止数组越界
            int j=0;
            for (;j<s[i].length() && j<preStr.length();j++){
                if (preStr.charAt(j)!=s[i].charAt(j)) {
                    break;
                }
            }
            preStr=preStr.substring(0,j);
        }
        System.out.println(preStr.length());
        return preStr;
    }

    public static void main(String[] args) {
        String[] s={"dog","racecar","car"};
        System.out.println(commonStr(s));
    }
}
