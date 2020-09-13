package com.algorithm;

import java.util.Stack;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/18
 */
public class SolutionBracketMatch {

    public static boolean isValid(String s) {

        //Character是char的包装类
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i) || '[' == s.charAt(i) || '{' == s.charAt(i)) {
                stack.push(s.charAt(i));
            }
            if (')' == s.charAt(i) || ']' == s.charAt(i) || '}' == s.charAt(i)) {
                if (stack.isEmpty()) {
                    return false;
                } else if ((s.charAt(i) == ')' && '(' == stack.peek()) ||
                        (s.charAt(i) == ']' && '[' == stack.peek()) ||
                        (s.charAt(i) == '}' && '{' == stack.peek())) {
                    stack.pop();
                }else{
                    return false;
                }

            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid(   "(])"));
    }
}
