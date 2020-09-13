package com.dynamic;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/24
 */
public class SolutionFib {

    //从小到大的动态规划，变量值保存的是最开始的值。这个值可能不止有一个，有多个值的话可以使用数组
    public static int fib(int N){
        if (N<=1)return N;
        int n1=0;
        int n2=1;
        int sum=0;
        for (int i = 2; i <=N; i++) {
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        //System.out.println(fib(6));
        //System.out.println(test(6));
        System.out.println(test02(1));
    }

    //从小到大动态规划实现阶乘，递归也可以实现阶乘。动态规划就是有记忆功能的递归
    public static int test(int n){
        int n1=1;
        int sum=0;
        if (n==1){
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            sum=i*n1;
            n1=sum;
        }
        return sum;
    }

    //从大到小的动态规划实现阶乘。便量保存的是最末尾的值
    public static int test02(int n){
        if (n==1)return 1;
        int sum=0;
        int n1=n;
        for (int i = n-1; i >= 1; i--) {
            sum=i*n1;
            n1=sum;
        }
        return sum;
    }
}
