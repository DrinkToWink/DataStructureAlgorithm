package com.niuke;

/**
 * @User 小菜鸡
 * @Data 2020/5/23
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * F(n)=F(n-1)+F(n-2)+...+F(1) (1)
 * F(n-1)=F(n-2)+...F(1) (2)
 * 用(1)-(2)得到F(n)=2F(n-1)=F(n-1)<<1
 * 这个算法真牛皮
 */
public class SolutionJumpFloorII {

    public static int jumpFloorII(int target){
        return 1<<(target-1);
    }

    public static void main(String[] args) {
        System.out.println(jumpFloorII(3));
    }
}
