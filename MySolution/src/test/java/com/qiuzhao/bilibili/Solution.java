package com.qiuzhao.bilibili;

import java.util.Stack;

/**
 * @User xiangyl
 * @Data 2020/8/13
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.IsValidExp("([)]"));
    }

    public boolean IsValidExp(String s) {
        if (s.trim().length() == 0) return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i) || '[' == s.charAt(i) || '{' == s.charAt(i)) {
                stack.push(s.charAt(i));
                continue;
            } else {
                if (stack.size() <= 0) {
                    return false;
                }
                if (    (stack.peek() == '(' && ')' == s.charAt(i)) ||
                        (stack.peek() == '[' && ']' == s.charAt(i)) ||
                        (stack.peek() == '{' && '}' == s.charAt(i))) {
                        stack.pop();
                }
            }

        }
        if (stack.size() == 0) return true;
        return false;
    }
}
