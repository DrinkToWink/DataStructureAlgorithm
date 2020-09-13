package com.qiuzhao.shunfeng;

import java.util.*;

/**
 * @User xiangyl
 * @Data 2020/8/20
 * <p>
 * 输入第一行包含两个数n,m
 * 接下来1行n个数，第i个数ai代表第 i 个服务器的带宽大小。
 * 接下来m行，每行两个数bi,ci，代表客户需求的带宽大小和他的预算。
 * n,m≤1000 , 1≤ai,bi,ci≤1000
 * <p>
 * 输出一个数，即小A最多能租多少元的服务器出去。
 * <p>
 * 样例输入
 * 3 4
 * 1 2 3
 * 2 1
 * 3 2
 * 3 3
 * 1 1
 * 输出：5
 * 样例解释
 * 1号服务器租给4号客户
 * 2号服务器租给1号客户
 * 3号服务器租给3号客户
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] client = new int[n][2];
        ArrayList<Integer> server = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            server.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < 2; i1++) {
                client[i][i1] = sc.nextInt();
            }
        }

        //对list进行排序
        Collections.sort(server);
        //对二维数组进行排序
        Arrays.sort(client, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if (o1[1]>o2[1])return -1;
                if (o1[1]<o2[1])return 1;
                if (o1[0]>o2[0])return 1;
                if (o1[0]<o2[0])return -1;
                return 0;
            }
        });

        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < server.size(); i1++) {
                if (client[i][0] <= server.get(i1)) {
                    sum += client[i][1];
                    server.remove(i1);
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
