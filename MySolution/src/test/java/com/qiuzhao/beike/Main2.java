package com.qiuzhao.beike;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/8/11
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] n = new long[t];
        long[] m = new long[t];
        for (int i = 0; i < t; i++) {
            n[i] = sc.nextLong();
            m[i] = sc.nextLong();
        }
        for (int i = 0; i < t; i++) {
            if ((n[i]*m[i])%2==0){
                System.out.println(2);
            }else {
                long temp=n[i]*m[i];
                long k=-1;
                for (long j=0;i<temp;j++){
                    if (temp%j==0){
                        k=j;
                        break;
                    }
                }
                System.out.println(k);
            }
        }

    }
}
