package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/21
 */
public class IntRverseTest {

    public int reverse(int x) {
        if (x%10==0 && x!=0){
            return 0;
        }
        int result = 0;
        while (x != 0) {
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE && x % 10 > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 ||
                    result == Integer.MIN_VALUE / 10 && (x % 10 < Integer.MIN_VALUE % 10)) {
                return 0;
            }
            result = x % 10 + result * 10;
            x = x / 10;
        }
        return result;
    }
}
