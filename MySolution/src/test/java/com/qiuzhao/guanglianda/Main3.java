package com.qiuzhao.guanglianda;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/7/22
 *
 * 在一个2D横版游戏中，所有的怪物都是在X轴上的，每个怪物有两个属性X和HP，分别代表怪物的位置和生命值。
 * 玩家控制的角色有一个AOE（范围攻击）技能，玩家每次释放技能可以选择一个位置x，
 * 技能会对[x-y,x+y]范围内的所有怪物造成1点伤害，请问，玩家最少需要使用多少次技能，
 * 才能杀死所有怪物，怪物血量清0即视为被杀死。
 *
 * 输入第一行包含一个两个正整数n和y，分别表示怪物的数量和技能的范围。（1<=n<=100000）
 * 接下来有n行，每行有两个正整数x和hp分别表示一只怪物的位置和血量。(1<=x,hp<=10^9)
 * 输出仅包含一个整数，表示最少使用的技能次数
 * 样例输入：
 * 3 5
 * 1 10
 * 10 5
 * 22 3
 * 样例输出：
 * 13
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt();
        int[] intX = new int[n];
        int[] intHp = new int[n];
        for (int i = 0; i < n; i++) {
            intX[i] = scanner.nextInt();
            intHp[i] = scanner.nextInt();
        }
    }
}
