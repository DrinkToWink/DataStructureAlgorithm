package com.qiuzhao.wangyi;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/8/8
 */
public class Main5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int k = 0; k < T; k++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            arr = paixun(arr);

            System.out.println(fenpei(arr));
        }
    }


    public static int fenpei(int[] arr) {
        int a = 0, b = 0;
        int x = 0, y = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (a <= b) a += arr[i];
            else b += arr[i];
            if (a == b) {
                x = a;
                y = b;
            }
        }
        System.out.println("sum=" + sum);
        return sum - x - y;
    }




    public static int[] paixun(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int k = i;
            int max = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    k = j;
                }
            }
            arr[k] = arr[i];
            arr[i] = max;
        }
        return arr;
    }
}
