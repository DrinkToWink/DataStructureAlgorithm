package com.niuke;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/30
 */
public class SolutionFibonacci {

    public int Fibonacci(int n){
        if (n<2)return n;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public int Fibonacci2(int n){
        if (n<2)return n;
        int f1=1;
        int f2=1;
        int result=0;
        for (int i = 3; i <= n; i++) {
            result=f1+f2;
            f1=f2;
            f2=result;
        }
        return result;
    }
}
