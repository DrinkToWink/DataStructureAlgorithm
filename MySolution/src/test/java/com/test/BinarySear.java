package com.test;

/**
 * @User xiangyl
 * @Data 2021/5/26
 */
public class BinarySear {

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 8, 9, 10,10, 11, 15, 20, 42};
        int key = 10;
        /*int tar = binarySearch(a, key, 0, a.length - 1);
        System.out.println(tar);*/
        int i = binarySearch2(a, key, 0, a.length - 1);
        System.out.println(i);
    }

    //二分查早，递归实现
    public static int binarySearch(int[] a, int key, int low, int high) {
        /*if (key>a[high] || key< a[low] || low>high){
            return -1;
        }*/
        int mid = (low + high) / 2;
        if (a[mid] > key) {
            return binarySearch(a, key, low, mid - 1);
        } else if (a[mid] < key) {
            return binarySearch(a, key, mid + 1, high);
        } else {
            return mid;
        }
    }

    //二分查找，非递归实现
    public static int binarySearch2(int[] a, int key, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] < key) {
                low = mid + 1;
            } else if (a[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
