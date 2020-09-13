package com.qiuzhao.xiecheng;

/**
 * @User xiangyl
 * @Data 2020/8/15
 */
public class Main {

    public static void main(String[] args) {
        int[] ints = divingBoard(1, 2, 3);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] divingBoard(int a, int b, int k) {
        int[] c={};
        if (k==0)return c;
        int[] arr= new int[k+1];
        for (int i = 0; i <= k; i++) {
            if (a>b){
                arr[i]=i*a+(k-i)*b;
            }else {
                arr[i]=i*b+(k-i)*a;
            }
        }
        return arr;
    }
}
