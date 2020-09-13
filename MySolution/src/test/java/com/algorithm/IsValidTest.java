package com.algorithm;

import java.util.Stack;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/21
 */
public class IsValidTest {

    public static boolean isValid(String s){
        //char的包装类Charact
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(' || s.charAt(i)=='[' ||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            if (s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
                if (stack.isEmpty())
                    return false;
                if ((s.charAt(i)==')' && stack.peek()=='(') ||
                        (s.charAt(i)==']' && stack.peek()=='[') ||
                        (s.charAt(i)=='}' && stack.peek()=='{')){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty()?true:false;
    }

    public static void main(String[] args) {
        String s= "{[]}";
        System.out.println(isValid(s));
    }
}
