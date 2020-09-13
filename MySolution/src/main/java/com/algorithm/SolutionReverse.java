package com.algorithm;

import org.junit.Test;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/16
 * 32位的整数翻转，超出范围的话，直接返回false，
 * 123-->321
 * -123-->-321
 */
public class SolutionReverse {

    @Test
    public void reverse() {
        int x = 236469;
        long result = 0;
        while (x != 0) {

            if (result > Integer.MAX_VALUE/10 ||
                    (result == Integer.MAX_VALUE / 10 && x % 10 > Integer.MAX_VALUE % 10)) {
                return;
            } else if (result < Integer.MIN_VALUE/10 ||
                    (result == Integer.MIN_VALUE / 10 && x % 10 < Integer.MIN_VALUE % 10))
                return;
            result = x % 10 + result * 10;
            x = x / 10;
        }
        System.out.println(Integer.MAX_VALUE % 10 + "," + Integer.MIN_VALUE % 10);
        System.out.println(result);
        //return result;

    }

}
