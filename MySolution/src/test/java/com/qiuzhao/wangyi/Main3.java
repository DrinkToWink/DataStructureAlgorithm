package com.qiuzhao.wangyi;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/8/8
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a={};
        int sum=0;
        int result=0;
        int[] ints = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            a = new int[n];
            for (int i1 = 0; i1 < n; i1++) {
                a[i]=sc.nextInt();
                map.put(a[i],i);
                sum+=a[i];
            }
        }
        a = quickSort(a, 0, a.length - 1);
        int temp=a[0];
        for (int i = 0; i < a.length; i++) {
            if (sum==2*temp){
                result=0;
            }
            if (sum>2*temp){
                for (int i1 = 0; i1 < a.length; i1++) {
                    map.containsKey(temp-a[i1]);
                    ints[0]=a[i1];
                    ints[1]=temp-a[i1];
                }
                result=ints[0]+ints[1];
            }
        }
        System.out.println(result);

    }




    public static int[] quickSort(int[] a, int low, int high) {
        if (low < high) {
            int index = getIndex(a, low, high);
            quickSort(a, low, index - 1);
            quickSort(a, index + 1, high);
        }
        return a;
    }

    public static int getIndex(int[] a, int low, int high) {
        int temp = a[low];
        while (low < high) {
            while (low < high && a[high] <= temp) {
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] >= temp) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = temp;
        return low;
    }

}
