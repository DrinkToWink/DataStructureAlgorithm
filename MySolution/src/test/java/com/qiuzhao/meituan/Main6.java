package com.qiuzhao.meituan;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/8/15
 */
public class Main6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ints=new int[n];
        int count=0;
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder(i+"");
            StringBuilder reverse = sb.reverse();
            int revInt = Integer.parseInt(reverse.toString());
            if (revInt%10!=0 && revInt<=n && revInt%i==0 && revInt/i==4){
                count++;
                ints[i]=revInt;
            }
        }
        System.out.println(count);
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]!=0){
                System.out.print(i+" "+ints[i]);
            }
        }

    }
}
