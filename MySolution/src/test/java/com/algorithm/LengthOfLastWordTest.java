package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/22
 */
public class LengthOfLastWordTest {

    public static int lengthOfLastWord(String s){
        if (s.length()==0){
            return 0;
        }
        int endIndex=0;
        int startIndex=0;
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i)!=' '){
                endIndex=i;
                break;
            }
        }
        for (int j=endIndex;j>=0;j--){
            if (s.charAt(j)==' '){
                startIndex=j;
                break;
            }else {
                startIndex=-1;
            }
        }
        return endIndex-startIndex;
    }

    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
