package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/20
 */
public class SolutionLengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int index=s.length()-1;
        int start=0;
        int end=0;
        while (index>=0 && ' '==s.charAt(index)){
            index--;
        }
        start=index;
        while (start>=0 && !(' '==s.charAt(start))){
            start--;
        }
        end=start;
        return end-start;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(""));
    }
}