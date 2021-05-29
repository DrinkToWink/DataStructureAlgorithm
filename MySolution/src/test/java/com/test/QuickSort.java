package com.test;

import java.util.Arrays;
import java.util.Collections;

/**
 * @User xiangyl
 * @Data 2021/5/26
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 10, 4, 6, 8, 20,10, 15, 42, 11};
        sort(arr, 0, arr.length - 1);
        //Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.println(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }

    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int index = getIndex(arr, low, high);
            sort(arr, index + 1, high);
            sort(arr, low, index - 1);
        }
    }

    public static int getIndex(int[] arr, int low, int high) {
        int temp = arr[low];
        while (low < high) {
            while (temp <= arr[high] && low < high) {
                high--;
            }
            arr[low] =  arr[high];
            while (temp>= arr[low] && low<high){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }
}
