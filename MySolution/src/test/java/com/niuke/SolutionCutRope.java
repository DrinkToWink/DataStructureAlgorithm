package com.niuke;

/**
 * @User 小菜鸡
 * @Data 2020/7/5
 */
public class SolutionCutRope {

    public int cutRope(int target){
        if (target<4)return target-1;
        //绳子分成的总段数；注意：绳子只分长度为2和长度为3的
        int ropeNum=target%3==0?target/3:target/3+1;
        //长度为2的绳子个数
        int ropeTwo=target%3==0?target%3:3- target%3;
        //长度为3的绳子个数
        int ropeThree=ropeNum-ropeTwo;
        int result=1;
        for (int i = 0; i < ropeNum; i++) {
           result=result*(ropeThree-i>0?3:2);
        }
        return result;
    }

    public static void main(String[] args) {
        SolutionCutRope sc = new SolutionCutRope();
        System.out.println(sc.cutRope(6));
    }
}
