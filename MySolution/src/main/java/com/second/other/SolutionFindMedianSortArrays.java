package com.second.other;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 解题思路：
 * 1.将两个数组合成一个数组，然后找出数组中间的那个数字就可以了，这种时间复杂比较高，达不到题目中的要求
 * 2.找出第K小的数，这种方式，时间复杂度可以达到题目中的要求
 */
public class SolutionFindMedianSortArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length==0 && nums2.length==0)return 0.0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums = new int[n1 + n2];
        if (nums1.length != 0 || nums2.length != 0) {
            //nums1的指针
            int p1=0;
            //nums2的指针
            int p2=0;
            //新数组的指针
            int p=0;
            //终止条件
            while (p1<n1 && p2<n2){
                //取出比较小的那个放到新的数组里面，哪个放到新数组里面，那么该数组的指针往后加1
                nums[p++]=nums1[p1]<nums2[p2]?nums1[p1++]:nums2[p2++];
            }
            //说明nums1里面的数据全部放到新数组里面，nums2还有一部分没有放入
            if (p1==n1){
                //原数组，原数组的起始索引，目标数组，目标数组的起始索引，原数组的长度
                System.arraycopy(nums2,p2,nums,p1+p2,n2-p2);
            }if (p2==n2){
                //原数组，原数组的起始索引，目标数组，目标数组的起始索引，原数组的长度
                System.arraycopy(nums1,p1,nums,p1+p2,n1-p1);
            }

        }
        if (nums.length%2==1)return nums[nums.length/2];
        return (nums[nums.length/2]+nums[(nums.length-1)/2])/2.0;
    }

    //找到第K小的数
    public static double findMedianSortedArrays2(int[] nums1,int[] nums2){

        return 0.0;
    }

    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
