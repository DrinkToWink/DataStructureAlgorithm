package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/19
 */
public class SolutionCountAndSay {

    public static String countAndSay(int n) {
        StringBuilder s = new StringBuilder();
        int pre = 0;
        int cur = 1;
        if (n == 1) {
            return "1";
        }
        //返回前面的那个字符串
        String str = countAndSay(n - 1);
        for (; cur < str.length(); cur++) {
            if (str.charAt(pre) != str.charAt(cur)) {
                int count = cur - pre;
                s.append(count).append(str.charAt(pre));
                pre = cur;
            }
        }
        //拼接最后一个数字，最后一个数字可能有多位相同
        int count = cur - pre;
        s.append(count).append(str.charAt(pre));
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
