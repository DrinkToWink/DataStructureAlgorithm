package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/21
 */
public class SearchInsertTest {

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid]<target){
                low=mid+1;
            }if(nums[mid]>target){
                high=mid-1;
            }if (nums[mid]==target){
                return mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        System.out.println(searchInsert(nums, 0));
    }

}
