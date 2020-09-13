package com.qiuzhao.bilibili;

/**
 * @User xiangyl
 * @Data 2020/8/13
 */
public class Solution2 {

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.GetCoinCount(200));
    }

    public int GetCoinCount (int N) {
        int res=1024-N;
        if (res%64==0)return res/64;
        else {
            int a=res%64;
            if (a%16==0)return res/64+a/16;
            else {
                int b=a%16;
                if (b%4==0)return res/64+a/16+b/4;
                else {
                    int c=b%4;
                    return res/16+a/16+b/4+c;
                }
            }
        }
    }
}
