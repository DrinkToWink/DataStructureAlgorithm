package com.qiuzhao.meituan;

import java.util.Scanner;

/**
 * @User 小菜鸡
 * @Data 2020/5/12
 *
 * 时间限制：C/C++语言 2000MS；其他语言 4000MS
 * 内存限制：C/C++语言 131072KB；其他语言 655360KB
 * 题目描述：
 * 给出n个数，求这n个数中两两最大的汉明距离
 * 两个数的汉明距离定义为两个数的二进制表示中不同的位数。
 * 例如11和6的汉明距离为3，因为11转换为二进制后为1011，6转换为二进制后为0110，他们的二进制第1,3,4位（从低位开始数）不同。
 *
 * 输入：
 * 第一行一个数n，代表有n个数
 * 接下来n个数，描述这n个数a1, a2 , .. ,an
 * 1≤n≤100      1≤ai≤10000
 *输出：
 * 两个数，最大的汉明距离
 *
 * 样例输入
 * 3
 * 1 2 3
 *样例输出
 * 2
 */
public class Main2 {

    public static void main(String[] args) {
        int bigLen=0;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] ints = new int[i];
        for (int j = 0; j < i; j++) {
            ints[j]=sc.nextInt();
        }
        for (int j = 0; j < i-1; j++) {
            for (int k=j+1;k<i;k++){
                int len = bigDistance(ints[j], ints[k]);
                if (len>bigLen)bigLen=len;
            }
        }
        System.out.println(bigLen);
    }

    public static int bigDistance(int x,int y){
        //运算得出两个数中，相同为不同值得个数
        int r=x^y;
        int count=0;
        while (r!=0){
            //每次抠除掉数中的一个1，并计数
            r=r&(r-1);
            count++;
        }
        return count;
    }

}
