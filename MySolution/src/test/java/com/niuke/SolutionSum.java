package com.niuke;

/**
 * @User 小菜鸡
 * @Data 2020/7/5
 */
public class SolutionSum {

    public int Sum_Soution(int n){
        int sum=n;
        boolean result=n>0 && (sum=sum+Sum_Soution(n-1))>0;
        return sum;
    }

    public static void main(String[] args) {
        SolutionSum ss = new SolutionSum();
        System.out.println(ss.Sum_Soution(5));
    }
}
