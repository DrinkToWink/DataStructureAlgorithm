package com.qiuzhao.beike;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/8/11
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int len = str.length();
        int count=0;
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i)!=str.charAt(n-1-i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
