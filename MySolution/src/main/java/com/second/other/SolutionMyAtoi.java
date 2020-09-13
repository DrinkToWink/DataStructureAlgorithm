package com.second.other;

/**
 * @User 小菜鸡
 * @Data 2020/5/8
 */
public class SolutionMyAtoi {

    public static int myAtoi(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        int flag = 1;
        int result = 0;
        int i = 0;
        //找到第一个非空格的字符
        while (i < len && chars[i] == ' ') i++;
        //如果全是空格
        if (i == len) return 0;
        if (chars[i] == '-') {
            i++;
            flag = -1;
        }else if (chars[i]=='+') i++;
        //从第一个非空的字符进行遍历
        while (i < len) {
            //判断当前字符是否为数字,不是数字的话，直接返回result
            if (!Character.isDigit(chars[i])) {
                return result;
            }
            //如果是正数，判断是否越界
            if(result>Integer.MAX_VALUE/10||
                    (result==Integer.MAX_VALUE/10 && (chars[i] - '0')>7))
                return Integer.MAX_VALUE;
            //如果是负数，判断是否越界
            if (result<Integer.MIN_VALUE/10||
                    (result==Integer.MIN_VALUE/10 &&(chars[i] - '0')>8))
                return Integer.MIN_VALUE;
            result = flag * (chars[i] - '0') + result * 10;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi( "-91283472332"));
        //System.out.println(Integer.MAX_VALUE);
    }
}
