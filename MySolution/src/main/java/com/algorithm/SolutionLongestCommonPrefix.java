package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/18
 *
 * 写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 */
public class SolutionLongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String preString = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j=0;
            for (; j < preString.length() && j < strs[i].length(); j++) {
                if (preString.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            preString = preString.substring(0, j);
            if (preString == null)
                return "";
        }
        return preString;
    }

    public static void main(String[] args) {
        String[] s = {"dog","racecar","car"};
        String result = longestCommonPrefix(s);
        System.out.println(result);
    }
}
