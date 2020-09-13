package com.niuke;

import java.util.ArrayList;

/**
 * @User 小菜鸡
 * @Data 2020/7/10
 */
public class SolutionMaxInWindows {

    /**
     * 暴力解法，并不是最优解
     * @param num
     * @param size
     * @return
     */
    public ArrayList<Integer> maxInWindows(int[] num,int size){
        ArrayList<Integer> list = new ArrayList<>();
        if (num==null||num.length<=0||size<=0||size>num.length)return list;
        for (int i = 0; i < num.length-size+1; i++) {
            int max=0;
            for (int i1 = i; i1 < i+size; i1++) {
                if (max<num[i1]){
                    max=num[i1];
                }
            }
            list.add(max);
        }
        return list;
    }

    public static void main(String[] args) {
        SolutionMaxInWindows solutionMaxInWindows = new SolutionMaxInWindows();
        int[] nums={2,3,4,2,6,2,5,1};
        System.out.println(solutionMaxInWindows.maxInWindows(nums, 3));
    }

    public ArrayList<Integer> maxInWindowsBetter(int[] num,int size){
        ArrayList<Integer> list = new ArrayList<>();
        if (num==null||num.length<=0||size<=0||size>num.length)return list;
        int max=num[0];
        int j=-2;
        for (int i = 0; i < num.length-size+1; i++) {
            if (num[i]>max && j+2<=i){
                max=num[i];
                j=i;
            }
        }
        return list;
    }
}
