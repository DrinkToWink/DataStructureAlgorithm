package com.qiuzhao.wangyi;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/8/8
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum=0;
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextLong();
            if (a[i]>1){
                sum+=a[i]/2;
            }
        }
        System.out.println(sum);
    }
}
