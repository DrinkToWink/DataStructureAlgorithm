package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/19
 */
public class SolutionSearchInsert {

    public static int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return low;
    }

    //二分查找实现
    public static int binarySearch(int[] ints,int low,int high,int target){
        int index=0;
        int mid=(low+high)/2;
        if (low>high){
            return -1;
        }
        if (target<ints[mid]){
            index=binarySearch(ints,0,mid-1,target);
        }else if(target==ints[mid]){
            return mid;
        }else {
            index=binarySearch(ints,mid+1,ints.length-1,target);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=7;
        System.out.println(searchInsert(nums, target));
    }
}
