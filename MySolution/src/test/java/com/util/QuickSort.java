package com.util;

/**
 * @User xiangyl
 * @Data 2020/8/2
 */
public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        double[] v={1.0,2.0,3.0,5.0,4.0};
        double[] result = quickSort.quickSort(v, 0, v.length - 1);
        for (double v1 : result) {
            System.out.print(v1+" ");
        }
    }


    public double[] quickSort(double[] v,int low,int high){
        if (low<high){
            int index = getIndex(v, low, high);
            quickSort(v,low,index-1);
            quickSort(v,index+1,high);
        }
        return v;
    }

    public int getIndex(double[] v,int low,int high){
        double temp=v[low];
        while (low<high){
            while (low<high && temp<=v[high]){
                high--;
            }
            v[low]=v[high];
            while (low<high && temp>=v[low]){
                low++;
            }
            v[high]=v[low];
        }
        v[low]=temp;
        return low;
    }
}
