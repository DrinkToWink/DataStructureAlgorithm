package com.sort;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/30
 */
public class QuickSort {

    public static int[] quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int i = low;
            int j = high;
            int flag = nums[low];
            while (i < j) {
                while (nums[j] >= flag && i < j) {
                    j--;
                }
                nums[i] = nums[j];
                while (nums[i] <= flag && i < j) {
                    i++;
                }
                nums[j] = nums[i];
            }
            nums[i] = flag;
            quickSort(nums, low, i - 1);
            quickSort(nums, i + 1, high);
        }
        return nums;
    }

    public static void main(String[] args) {
        int a[] = {16, 13, 19, 15, 20, 18, 17, 14, 12, 11, 10, 30};
        int[] ints = quickSort(a, 0, a.length - 1);
        for (int anInt : ints) {
            System.out.print(anInt + ",");
        }
    }
}
