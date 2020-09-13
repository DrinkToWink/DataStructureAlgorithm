package com.second.other;

import java.util.HashMap;

public class SolutionLengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLength=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                //如果map中包含这个数，那么就把这个数后面的那个数重新作为起点，来进行比较
                left=Math.max(left,map.get(s.charAt(i))+1);
            }
            //因为是在for循环里面的，所以不用担心数组越界问题
            map.put(s.charAt(i),i);
            maxLength=Math.max(maxLength,i-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
