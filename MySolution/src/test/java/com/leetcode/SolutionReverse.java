package com.leetcode;

/**
 * @User xiangyl
 * @Data 2021/5/28
 */
public class SolutionReverse {

    public static void main(String[] args) {
        SolutionReverse solutionReverse = new SolutionReverse();
        System.out.println(solutionReverse.reverse(1534236469));
    }

    public int reverse(int x) {
        int res = 0;
        int a = 0;
        while (x != 0) {
            if (res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10)
            a = x % 10;
            x /= 10;
            res = res * 10 + a;
        }
        return res;
    }
}
