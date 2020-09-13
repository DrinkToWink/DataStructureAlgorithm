package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/21
 */
public class LongestCommenPrefixTest {

    public static String longestCommenPrefix(String[] strs){
        if (strs.length<0)return "";
        String preStr=strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j=0;
            for (;j<preStr.length() && j<strs[i].length();j++){
                if (preStr.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            preStr=preStr.substring(0,j);
        }
        return preStr;
    }

    public static void main(String[] args) {
        String[] s={"dog","","car"};
        System.out.println(longestCommenPrefix(s));
    }
}
