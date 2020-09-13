package com.qiuzhao.guanglianda;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/7/22
 * <p>
 * 有一种排序算法定义如下，该排序算法每次只能把一个元素提到序列的开头，例如2，1，3，4，只需要一次操作把1提到序列起始位置就可以使得原序列从小到大有序。
 * 现在给你个乱序的1-n的排列，请你计算最少需要多少次操作才可以使得原序列从小到大有序。
 * <p>
 * 输入第一行包含一个正整数n ，表示序列的长度。(1<=n<=100000)
 * 接下来一行有n个正整数，表示序列中的n个元素，中间用空格隔开。(1<=a_i<=n)
 * <p>
 * 输出仅包含一个整数，表示最少的操作次数。
 * <p>
 * 输入：4
 * 2 1 3 4
 * 输出：1
 */
public class Main2 {

    public static void main(String[] args) {

        int[] a={1,3,5};
        int[] b={2,4,6};
        Main2 main2 = new Main2();
        int print = main2.print(a, b);
        System.out.println(print);
    }
    public int print(int[] a, int[] b) {
        int len = a.length + b.length;
        int[] ints = new int[len];
        int count = 0;
        int i=0;
            if (a[count] > b[i] && count < a.length) {
                ints[i] = b[i];
                count++;
            } else {
                ints[i] = a[count];
                i++;
            }

        if (len % 2 == 1) {
            return ints[len / 2];
        }
        return (ints[len / 2] + ints[len / 2 + 1]) / 2;
    }
}
