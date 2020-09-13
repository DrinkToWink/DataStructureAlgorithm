package com.qiuzhao.meituan;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @User 小菜鸡
 * @Data 2020/5/12
 *
 * 输入第一行包含两个正整数n和m，分别代表学生人数和考试科目数量。(n,m<=500)
 * 接下来有n行，每行有m个正整数，每个正整数在1-100之间，中间用空格隔开，表示每个学生的m科考试成绩。
 *
 * 输出仅包含一个整数，表示获得单科成绩优秀奖的人数
 *
 * 样例输入
 * 5 5
 * 28 35 38 10 19
 * 4 76 72 38 86
 * 96 80 81 17 10
 * 70 64 86 85 10
 * 1 93 19 34 41
 * 样例输出
 * 4
 * 注意，输出结果为人数，并非人次。同一个学生如有多科最优，获奖人数也只会计为1人，即输出结果始终小于等于n
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                a[i][i1] = sc.nextInt();
            }
        }
        //利用HashMap的key来进行去除重复的值
        HashMap<Object, Object> hashMap = new HashMap<>();
        int row=0;
        for (int i = 0; i < m; i++) {
            int big=0;
            //找出某一列中的最大值，并将最大值的行号+1当作hashmap的key
            for (int i1 = 0; i1 < n; i1++) {
                if (a[i1][i]>big){
                    big=a[i1][i];
                    row=i1;
                }
            }
            //放入hashmap中时，这个int类型的row+1因该会被转换成integer包装类吧，所以没有报错（猜的）
            hashMap.put(row+1,"1");
        }
        System.out.println(hashMap.size());
    }
}
