package com.qiuzhao.meituan;

import java.util.Scanner;

/**
 * @User 小菜鸡
 * @Data 2020/5/12
 *
 * 两个数是相似的，当且仅当他们位与起来不为0。例如，3和5是相似的，因为3的二进制为011,5的二进制为101,他们位与起来为001不为0。
 * 现在，给出序列a1,a2…an我们希望你找出，对于任意的i∈[1,n]，是否存在j∈[1,n]，使得ai,aj不相似。
 *
 * 输入：
 * 输入第一行包括一个整数n，代表序列a的长度
 * 接下来一行n个数，空格隔开，代表序列a
 * 1<=n<=100000,1<=ai<=106
 * 输出：
 * 输出n个数。
 * 如果对于i个数，存在j∈[1,n]，使得ai,aj不相似，输出1,否则输出-1
 *
 * 样例输入：
 * 4
 * 3 5 6 1
 * 样例输出：
 * -1 -1 1 1
 * 提示：
 * 样例解释：
 * 唯一一对不相似的数是6和1,故6和1的答案为1,其余为-1。
 */
public class Main5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] a=new int[i];
        int[] result=new int[i];
        for (int i1 = 0; i1 < i; i1++) {
            a[i1] = sc.nextInt();
        }
        for (int i1 = 0; i1 < i-1; i1++) {
            for (int j=i1+1;j<i;j++){
                if ((a[i1]&a[j])==0){
                    result[i1]=1;
                    result[j]=1;
                    if (j==i-1 && result[j]==0){
                        result[j]=-1;
                    }
                    break;
                }
            }
            if (result[i1]==1)continue;
            result[i1]=-1;
        }
        for (int i1 : result) {
            System.out.println(i1);
        }
    }
}
