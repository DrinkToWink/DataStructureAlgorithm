package com.niuke;

/**
 * @author: 一个小菜逼
 * @Date: 2020/5/1
 */
public class SolutionReplaceSpace {

    public static String replaceSpace(StringBuffer str){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (' '==str.charAt(i)){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(String.valueOf(str.charAt(i)));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("We Are Happpy");
        System.out.println(replaceSpace(str));
    }
}
