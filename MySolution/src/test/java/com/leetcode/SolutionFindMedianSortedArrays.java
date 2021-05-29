package com.leetcode;

import java.util.Arrays;

/**
 * @User xiangyl
 * @Data 2021/5/28
 */
public class SolutionFindMedianSortedArrays {

    public static void main(String[] args) {
        SolutionFindMedianSortedArrays solutionFindMedianSortedArrays = new SolutionFindMedianSortedArrays();
        int[] a={1,2};
        int[] b={3,4};
        double medianSortedArrays = solutionFindMedianSortedArrays.findMedianSortedArrays(a, b);
        System.out.println(medianSortedArrays);
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ints = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, ints, 0, nums1.length);
        System.arraycopy(nums2, 0, ints, nums1.length, nums2.length);
        Arrays.sort(ints);
        if (ints.length % 2 == 1) {
            return ints[ints.length / 2];
        } else {
            return (ints[(ints.length - 1) / 2] + ints[ints.length / 2]) / 2.0;
        }
    }
}