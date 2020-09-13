package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/27
 */
public class SolutionIsPalindrome2 {

    public static boolean isPalindrome(String s){
        if(s.length()==1 || s.length()==0)return true;
        char[] nums = s.toCharArray();
        int m=0;
        for (int i = 1; i < s.length(); i++) {
            if (nums[m]==s.charAt(i)) {
              String sub=s.substring(m,i+1);
              int i1=0;
                for (; i1 < sub.length(); i1++) {
                    if (sub.charAt(i1)!=sub.charAt(sub.length()-1-i1)) {
                        break;
                    }
                }
                if (i1==sub.length()){
                    System.out.println("找到了回文字符串"+sub);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s= "cabad";
        System.out.println(isPalindrome(s));
    }
}
