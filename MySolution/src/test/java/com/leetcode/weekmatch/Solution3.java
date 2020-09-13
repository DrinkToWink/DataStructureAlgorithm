package com.leetcode.weekmatch;

/**
 * @User xiangyl
 * @Data 2020/8/9
 */
public class Solution3 {
    public char findKthBit(int n, int k) {
        String sn = getSn(n);
        return sn.charAt(k-1);
    }

    public String getSn(int n) {
        if (n == 1) {
            return "0";
        }
        String pre = getSn(n - 1);
        return pre + "1" + (invert(pre)).reverse().toString();
    }

    public StringBuilder invert(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                sb.append("1");
            }else {
                sb.append("0");
            }
        }
        return sb;
    }
}
