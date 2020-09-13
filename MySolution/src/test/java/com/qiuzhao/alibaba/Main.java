package com.qiuzhao.alibaba;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/7/20
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[][] print = main.print();
        for (int[] ints : print) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }

    public int[][] print(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] ints=new int[t][3];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (k==1){
                ints[i][0]=1;
                ints[i][1]=2;
                ints[i][2]=n-k-3;
            }else {
                if (n%k!=0){
                    ints[i][0]=-1;
                    return ints;
                }else {

                }
            }
        }
        return ints;
    }
}
