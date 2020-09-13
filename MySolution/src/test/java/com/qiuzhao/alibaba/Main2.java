package com.qiuzhao.alibaba;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/7/20
 */
public class Main2 {

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        int[] print = main2.print();
        for (int i : print) {
            System.out.println(i);
        }

    }

    public int[] print() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] b=new int[i];
        for (int i1 = 0; i1 < i; i1++) {
            int num=0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            for (int j = n; j <= k; j++) {
                int[] nums=new int[10];
                int count=0;
                while (n!=0) {
                    nums[count++] =n%10;
                    n = n / 10;
                }
                for (int i2 = 0; i2 < count-1; i2++) {
                    if (nums[i2]==7){
                        num++;
                    }
                    int a= nums[i2]- nums[i2+1];
                    if (a>0){
                        nums[i2+1]=a;
                    }else {
                        nums[i2+1]=-a;
                    }
                    if (nums[count-1]==7){
                        num++;
                    }
                }

            }
            b[i1]=num;
        }
        return b;
    }
}
