package com.qiuzhao.shunfeng;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/8/20
 * <p>
 * 第一行一个数n表示任务的个数。(1≤n≤1e3)
 * 接下来n行每行三个整数l, r, w表示第i个任务的开始时间，结束时间，以及收益。(1≤l≤r≤1e6,1≤w≤1e9)
 * <p>
 * 输出一个值表示克里森最多获得的金钱数量。
 * <p>
 * 样例输入
 * 3
 * 1 3 5
 * 2 7 3
 * 5 10 1
 * 输出：6
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ints = new int[n][3];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < 3; i1++) {
                ints[i][i1] = sc.nextInt();
            }
        }
        int j = -1;
        for (int i = 0; i < n - 1; i++) {
            if ( ints[i][2] >= ints[i + 1][2]&& i != j) {
                sum = sum + ints[i][2];
                if (ints[i][1] >= ints[i + 1][0]){
                    j = i + 1;
                }
            }
        }
        sum+=ints[n-1][2];
        System.out.println(sum);
    }
}
