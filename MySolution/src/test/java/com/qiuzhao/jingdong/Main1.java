package com.qiuzhao.jingdong;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/8/6
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float result=0.0f;
        for (int i = 1; i <= 2*n; i++) {
            float k=i%2==0?-1:1;
            result+=1/(k*5*i);
        }
        System.out.printf("%.4f\n",result);
    }


}
