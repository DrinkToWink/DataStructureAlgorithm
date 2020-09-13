package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/19
 */
public class SolutionStrStr {

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() == 0) return -1;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int j = 0;
            if (needle.charAt(0) == haystack.charAt(i)) {
                for (; j < needle.length() && j < haystack.length(); j++) {
                    if (needle.charAt(j) != haystack.charAt(j + i)) {
                        break;
                    }
                }
            }
            if (j==needle.length()) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issip"));
    }
}
