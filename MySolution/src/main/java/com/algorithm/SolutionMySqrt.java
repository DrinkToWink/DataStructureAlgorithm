package com.algorithm;

import sun.font.GlyphLayout;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/24
 */
public class SolutionMySqrt {

    //这种方式时间复杂度有点高，
    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 2;
        int right = x / left;
        while (left <= right) {
            if (left == right) {
                return left;
            } else if (left < right) {
                left++;
            }
            right = x / left;
        }
        if (left != right)
            left--;
        return left;
    }

    //二分法实现,这个算法是更好的
    public static int mySqrt2(int x){
        if (x<2)return x;
        int low=0;
        int high=x;
        int mid=(high+low)/2;
        while (low<=high){
            if (x/mid==mid){
                return mid;
            }else if(x/mid>mid){
                low=mid+1;
            }else {
                high=mid-1;
            }
            mid=(high+low)/2;
        }
        if(x/mid!=mid)low--;
        return low;
    }

    public static void main(String[] args) {
//        System.out.println(mySqrt(2));
        System.out.println(mySqrt2(12));
    }
}
