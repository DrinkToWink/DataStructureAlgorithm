package com.others;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/30
 */
public class SolutionIsPalindrome {

    public static boolean isPalindrome(String s) {
        if (s.length() == 0 ) return true;
        //字符串中的大写全部转化为小写
        String s1 = s.toLowerCase();
        //将字符串转化为字符数组
        char[] chars = s1.toCharArray();
        int low = 0;
        int high = chars.length - 1;
        //有一种特殊的情况，全部都是逗号或者其他的字符，这种情况也返回true，因为题意只判断数字和字母
        while (low <= high) {
            //从前往后，找到第一个是字符或者字母
            if (!Character.isLetterOrDigit(chars[low])) {
                low++;
                continue;
            }
            //从后往前，找到第一个字符或者字母
            if (!Character.isLetterOrDigit(chars[high])) {
                high--;
                continue;
            }
            if (chars[low] != chars[high]) return false;
            else {
                low++;
                high--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "a";
        String s1 = ".";
        System.out.println(isPalindrome(s1));
        //System.out.println(s1.trim()==".");
    }
}
