package com.leetcode.weekmatch;

import javax.lang.model.element.VariableElement;

/**
 * @User xiangyl
 * @Data 2020/8/9
 */
public class Solution {

    public static void main(String[] args) {
//        String s = "leEeetcode";
//        System.out.println(makeGood(s));
        System.out.println(findkthBit(4, 11));
    }

    public static String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1) + 32 || sb.charAt(i) + 32 == sb.charAt(i + 1)) {
                sb = sb.deleteCharAt(i);
                sb = sb.deleteCharAt(i);
                i = i - 2;
                if (i < 0) {
                    i = -1;
                }
            }
        }
        return sb.toString();
    }

    public static char findkthBit(int n, int k) {
        StringBuilder str = new StringBuilder("0");
        for (int i = 1; i < n; i++) {
            StringBuilder reverse = invert(new StringBuilder(str).toString()).reverse();
            str=str.append("1").append(reverse);
        }
        return str.charAt(k-1);
    }

    public static StringBuilder invert(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='0')chars[i]='1';
            else chars[i]='0';
        }
        return new StringBuilder(new String(chars));
    }

}
