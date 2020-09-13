package com.niuke;

/**
 * @User 小菜鸡
 * @Data 2020/5/28
 */
public class SolutionAdd {

    public static int add(int num1, int num2) {
        int result = -1;
        int carry = -1;
        while (carry != 0) {
            //出去进位的相加的结果
            result = num1 ^ num2;
            //得到进位的结果
            carry = (num1 & num2)<<1;
            num1 = result;
            num2 = carry;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 6));
    }
}
