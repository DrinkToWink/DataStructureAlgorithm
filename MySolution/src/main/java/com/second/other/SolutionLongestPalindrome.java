package com.second.other;

/**
 * @User 小菜鸡
 * @Data 2020/5/6
 * <p>
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 解题思路
 * 1.暴力解法：写一个方法来判断当前字符串是否为回文串，然后截取出s的所有回文串，记录最长的那个并返回
 * 2.中心扩散法：先找到回文串然后判断哪个回文串时最长的，相比于暴力法少了很多非回文串的切割与比较
 * 理论上来说他们的时间复杂度都是O(n^2)，但是提交上去，中心扩散法却快乐很多
 * 3.动态规划法：看别人的题解没有看懂，就不写了
 */
public class SolutionLongestPalindrome {

    //暴力解法，可以解出来，但是会超过时间限制，显然是不合理的
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 1) return s;
        int maxLen = 0;
        String maxStr = "";
        for (int i = 0; i < s.length(); i++) {
            int i1 = i + 1;
            for (; i1 < s.length() + 1; i1++) {
                String Str = s.substring(i, i1);
                if (isPalindromic(Str) && Str.length() > maxLen) {
                    maxStr = Str;
                    maxLen = Math.max(maxLen, maxStr.length());
                }
            }
        }
        return maxStr;
    }

    public static boolean isPalindromic(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i <= s.length() - 1 - i && s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    //中心扩散法，这复时间杂度不也是O(n^2)？跟暴力法不是一样吗？
    public static String longestPalindrome2(String s) {
        if (s == null || s.length() == 1) return s;
        //初始化左、右两个指针的位置
        int left = 0;
        int right = 0;
        int maxLen = 0;
        String maxStr = "";
        for (int i = 0; i < s.length(); i++) {
            left = i - 1;
            right = i + 1;
            while (left >= 0 && s.charAt(left) == s.charAt(i)) left--;
            while (right < s.length() && s.charAt(right) == s.charAt(i)) right++;
            //找出每一次以s.charAt(i)为中心时的回文串
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            String str = s.substring(left + 1, right);
            //记录下最长的字符串
            if (str.length() > maxLen) {
                maxStr = str;
                maxLen = Math.max(maxLen, str.length());
            }
        }
        return maxStr;
    }

    public static void main(String[] args) {
        String s = "cbbd";
        //System.out.println(longestPalindrome(s));
        System.out.println(longestPalindrome2(s));
    }
}
