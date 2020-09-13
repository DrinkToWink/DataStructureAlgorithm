package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/24
 */
public class SolutionMerge {

    public static void merge(int[] nums1,int m,int[] nums2,int n){
        int[] nums1_copy=new int[m];
        //将nums1数组复制到nums1_copy数组中，一旦复制就相当于造成了空间的浪费，毕竟多new出一个数组，多占了一份空间
        //四个参数分别是源数组，源数组复制的起始位置，目标数组，目标数组的起始位置，源数组复制的长度
        System.arraycopy(nums1,0,nums1_copy,0,m);
        int p1=0;
        int p2=0;
        int p=0;
        while (p1<m && p2<n){
            nums1[p]=nums1_copy[p1]<nums2[p2]?nums1_copy[p1++]:nums2[p2++];
            p++;
        }
        //说明m>n,此时p2==n
        if (p1<m){
            System.arraycopy(nums1_copy,p1,nums1,p1+p2,m-p1);
        }
        //说明m<=n，此时p1==m
        else {
            System.arraycopy(nums2,p2,nums1,p1+p2,n-p2);
        }
//        for (int i = 0; i < nums1.length; i++) {
//            System.out.print(nums1[i]+",");
//        }
    }

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        merge(nums1,3,nums2,3);
    }
}
