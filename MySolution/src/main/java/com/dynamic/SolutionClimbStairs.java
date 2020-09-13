package com.dynamic;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/24
 */
public class SolutionClimbStairs {

    //动态规划法求解，fn=f(n-1)+f(n-2)
    public static int climbStairs(int n){
        if (n<=2)return n;
        int n1=1;//f(n-2)
        int n2=2;//f(n-1)
        int sum=0;//f(n)
        for (int i=3;i<=n;i++){
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(11));
    }
}
