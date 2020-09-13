package com.niuke;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/30
 */
public class SolutionJumpFloor {

    public static int jumpFloor(int target){
        if (target<3)return target;
        int f1=1;
        int f2=2;
        int result=0;
        for (int i = 3; i <= target; i++) {
            result=f1+f2;
            f1=f2;
            f2=result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(jumpFloor(4));
    }
}
