package com.qiuzhao.qianxin;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/8/1
 *
 * 完全背包问题
 */
public class Main {

    public static void main(String[] args) {
        Main main2 = new Main();
        Scanner sc = new Scanner(System.in);
        int sumMoney = sc.nextInt();
        int n = sc.nextInt();
        int[] p=new int[n];
        int[] w = new int[n];
        HashMap<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            p[i]=sc.nextInt();
            w[i]=sc.nextInt();
        }

    }

    //快速排序
    public int[] quickSort(int[] v,int low,int high){
        if (low<high){
            int index = getIndex(v, low, high);
            quickSort(v,low,index-1);
            quickSort(v,index+1,high);
        }
        return v;
    }

    //从大到小
    public int getIndex(int[] v,int low,int high){
        int temp=v[low];
        while (low<high){
            while (low<high && temp>=v[high]){
                high--;
            }
            v[low]=v[high];
            while (low<high && temp<=v[low]){
                low++;
            }
            v[high]=v[low];
        }
        v[low]=temp;
        return low;
    }
}
