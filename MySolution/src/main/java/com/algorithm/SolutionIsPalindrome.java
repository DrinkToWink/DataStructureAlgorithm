package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/16
 * 判断一个整数是否是回文数
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class SolutionIsPalindrome {

    public static boolean sameIntTest(int x){
        String s = String.valueOf(x);
        int length = s.length();
        char[] chars=new char[length];
        char[] chars2=new char[length];
        boolean flag=true;
        if (x>=0){
            if (length%2==0){
                for (int i=0;i<length/2;i++){
                    chars[i]=s.charAt(i);
                }
                for (int i=length/2;i<length;i++){
                    chars2[i]=s.charAt(i);
                }
                for (int i=0;i<length/2;i++){
                    if (chars[i]==chars2[length-i-1]){
                        flag=true;
                    }else {
                        return false;
                    }
                }
                return flag;
            }else {
                for (int i=0;i<length/2;i++){
                    chars[i]=s.charAt(i);
                }
                for (int i=length/2+1;i<length;i++){
                    chars2[i]=s.charAt(i);
                }
                for (int i=0;i<length/2;i++){
                    if (chars[i]==chars2[length-1-i]){
                        flag=true;
                    }else{
                       return false;
                    }
                }
                return flag;
            }
        }
        return false;
    }

    public static boolean sameIntTest02(int x){
        //当x为10的倍数，那么反转之后，第一个数字必须是0才能满足回文数，这样的数字只有0
        if (x<0 || (x%10==0 && x!=0)){
            return false;
        }
        int result=0;
        while (result<x) {
            result=result*10+x%10;
            x=x/10;
        }
        return x==result || x==result/10;
    }

    public static void main(String[] args) {
        System.out.println(sameIntTest(1000021));
        System.out.println(sameIntTest02(10));
    }
}
