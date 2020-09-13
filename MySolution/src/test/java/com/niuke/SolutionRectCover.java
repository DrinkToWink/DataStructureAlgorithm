package com.niuke;

/**
 * @User 小菜鸡
 * @Data 2020/5/23
 */
public class SolutionRectCover {

    public static int rectCover(int target){
        if (target<3)return target;
        int f1=1;
        int f2=2;
        int cur=0;
        for (int i = 2; i < target; i++) {
            cur=f1+f2;
            f1=f2;
            f2=cur;
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(rectCover(5));
    }
}
