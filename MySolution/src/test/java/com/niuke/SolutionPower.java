package com.niuke;

import java.io.PipedWriter;

/**
 * @User 小菜鸡
 * @Data 2020/5/23
 */
public class SolutionPower {

    public static double power(double base, int exponent) {
        if (base == 0 && exponent == 0) return 0.0;
        double result = 1.0;
        if (exponent>0){
            for (int i = 0; i < exponent; i++) {
                result = result * base;
            }
        }else if (exponent<0){
            for (int i = 0; i < -exponent; i++) {
                result=result*base;
            }
            result=1/result;
        }
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(power(2.33, 3));
        System.out.println((-1));
    }
}
