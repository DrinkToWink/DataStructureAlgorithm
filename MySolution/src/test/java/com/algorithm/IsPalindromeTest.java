package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/21
 */
public class IsPalindromeTest {

    public boolean isPalindrome(int x){
        if (x<0 || (x%10==0 && x!=0)){
            return false;
        }
        if (x==0){
            return true;
        }
        int result=0;
        while (x>result){
            result=result*10+x%10;
            x=x/10;
        }
        return x==result || x==result/10;
    }
}
