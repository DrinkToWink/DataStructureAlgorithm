package com.test;

/**
 * @User xiangyl
 * @Data 2021/5/29
 */
public class OtherTest {

    public static void main(String[] args) {
        int[] a = {10, 11, 12};
        int value = 13;
        System.out.println(getMaxNum(a, value));
    }

    //查找有序数组中小于给定值的最大值
    public static int getMaxNum(int[] a, int value) {
        if (a.length == 1) {
            if (a[0] < value) {
                return a[0];
            }
            return -1;
        }
        if (a[0] >= value) {
            return -1;
        }
        int low = 0;
        int high = a.length - 1;
        while (low < high) {
            while (value <= a[high] && low < high) {
                high--;
            }
            a[low] = a[high];
            while (value >= a[low] && low < high) {
                low++;
            }
            a[high] = a[low];
        }
        return a[low];
    }
}
