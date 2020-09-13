package com.qiuzhao.guanglianda;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/7/22
 * <p>
 * 给出你n条长度不一样的边，请你从中选择四条边，组成一个最大的平行四边形。
 * 并输出最大的平行四边形的面积
 * <p>
 * 输入第一行包含一个正整数n，表示边的数量。(4<=n<=50000)
 * 输入第二行包含n个正整数，表示n条边的长度，边的长度不会超过10^9。
 * <p>
 * 输出仅包含一个正整数，即最大的平行四边形的面积，无解则输出-1
 * 样例输入：5
 * 3 3 4 4 5
 * 输出：12
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        int pre = 0;
        int cur = 0;
        for (Integer key : map.keySet()) {
            if (cur < key && map.get(key) >= 2) {
                pre=cur;
                cur = key;
            }
        }
        if (map.get(cur) < 4) {
            System.out.println(pre * cur);
        } else {
            System.out.println(cur * cur);
        }

    }

}
