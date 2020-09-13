package com.qiuzhao.bilibili;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/8/13
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int[] ints = new int[4];
        for (int i = 0; i < 4; i++) {
            ints[i] = sc.nextInt();
        }
        boolean b = main.Game24Points(ints);
    }

    public boolean Game24Points(int[] arr) {
        if (arr[0] + arr[1] + arr[2] + arr[3] == 24) return true;
        if (arr[0] + arr[1] + arr[2] - arr[3] == 24) return true;
        if (arr[0] + arr[1] + arr[2] * arr[3] == 24) return true;
        if (arr[2] % arr[3] == 0 && arr[0] + arr[1] + arr[2] / arr[3] == 24) return true;

        if (arr[0] + arr[1] - arr[2] + arr[3] == 24) return true;
        if (arr[0] + arr[1] - arr[2] - arr[3] == 24) return true;
        if (arr[0] + arr[1] - arr[2] * arr[3] == 24) return true;
        if (arr[2] % arr[3] == 0 && arr[0] + arr[1] + arr[2] / arr[3] == 24) return true;


        if (arr[0] + arr[1] * arr[2] + arr[3] == 24) return true;
        if (arr[0] + arr[1] * arr[2] - arr[3] == 24) return true;
        if (arr[0] + arr[1] * arr[2] * arr[3] == 24) return true;
        if (arr[2] % arr[3] == 0 && arr[0] + arr[1] * arr[2] / arr[3] == 24) return true;

        if (arr[1] % arr[2] == 0 && arr[0] + arr[1] / arr[2] + arr[3] == 24) return true;
        if (arr[1] % arr[2] == 0 && arr[0] + arr[1] / arr[2] - arr[3] == 24) return true;
        if (arr[1] % arr[2] == 0 && arr[0] + arr[1] / arr[2] * arr[3] == 24) return true;
        if (arr[1] % arr[2] == 0 && arr[1] / arr[2] % arr[3] == 0 && arr[0] + arr[1] / arr[2] / arr[3] == 24) return true;


        if (arr[0] - arr[1] + arr[2] + arr[3] == 24) return true;
        if (arr[0] - arr[1] + arr[2] - arr[3] == 24) return true;
        if (arr[0] - arr[1] + arr[2] * arr[3] == 24) return true;
        if (arr[2]%arr[3]==0 && arr[0] - arr[1] + arr[2] / arr[3] == 24) return true;

        if (arr[0] - arr[1] - arr[2] + arr[3] == 24) return true;
        if (arr[0] - arr[1] - arr[2] - arr[3] == 24) return true;
        if (arr[0] - arr[1] - arr[2] * arr[3] == 24) return true;
        if (arr[2]%arr[3]==0 &&arr[0] - arr[1] - arr[2] / arr[3] == 24) return true;

        if (arr[0] - arr[1] * arr[2] + arr[3] == 24) return true;
        if (arr[0] - arr[1] * arr[2] - arr[3] == 24) return true;
        if (arr[0] - arr[1] * arr[2] * arr[3] == 24) return true;
        if (arr[2]%arr[3]==0 && arr[0] - arr[1] * arr[2] / arr[3] == 24) return true;


        if (arr[1]%arr[2]==0 &&  arr[0] - arr[1] / arr[2] + arr[3] == 24) return true;
        if (arr[1]%arr[2]==0 &&arr[0] - arr[1] / arr[2] - arr[3] == 24) return true;
        if (arr[1]%arr[2]==0 &&arr[0] - arr[1] / arr[2] * arr[3] == 24) return true;
        if (arr[1]%arr[2]==0 && arr[1]/arr[2]%arr[3]==0 &&arr[0] - arr[1] / arr[2] / arr[3] == 24) return true;


        if (arr[0] * arr[1] + arr[2] + arr[3] == 24) return true;
        if (arr[0] * arr[1] + arr[2] - arr[3] == 24) return true;
        if (arr[0] * arr[1] + arr[2] * arr[3] == 24) return true;
        if (arr[2]%arr[3]==0 && arr[0] * arr[1] + arr[2] / arr[3] == 24) return true;

        if (arr[0] * arr[1] - arr[2] + arr[3] == 24) return true;
        if (arr[0] * arr[1] - arr[2] - arr[3] == 24) return true;
        if (arr[0] * arr[1] - arr[2] * arr[3] == 24) return true;
        if (arr[2]%arr[3]==0 &&arr[0] * arr[1] - arr[2] / arr[3] == 24) return true;

        if (arr[0] * arr[1] * arr[2] + arr[3] == 24) return true;
        if (arr[0] * arr[1] * arr[2] - arr[3] == 24) return true;
        if (arr[0] * arr[1] * arr[2] * arr[3] == 24) return true;
        if (arr[2]%arr[3]==0 &&arr[0] * arr[1] * arr[2] / arr[3] == 24) return true;

        if (arr[1]%arr[2]==0 && arr[0] * arr[1] / arr[2] + arr[3] == 24) return true;
        if (arr[1]%arr[2]==0 &&arr[0] * arr[1] / arr[2] - arr[3] == 24) return true;
        if (arr[1]%arr[2]==0 && arr[0] * arr[1] / arr[2] * arr[3] == 24) return true;
        if (arr[1]%arr[2]==0 && arr[1]/arr[2]%arr[3]==0&&  arr[0] * arr[1] / arr[2] / arr[3] == 24) return true;


        if (arr[0] / arr[1] + arr[2] + arr[3] == 24) return true;
        if (arr[0] / arr[1] + arr[2] - arr[3] == 24) return true;
        if (arr[0] / arr[1] + arr[2] * arr[3] == 24) return true;
        if (arr[2]% arr[3]==0 &&arr[0] % arr[1]==0 && arr[0] / arr[1] + arr[2] / arr[3] == 24) return true;

        if (arr[0] %arr[1]==0 && arr[0] / arr[1] - arr[2] + arr[3] == 24) return true;
        if (arr[0] %arr[1]==0 && arr[0] / arr[1] - arr[2] - arr[3] == 24) return true;
        if (arr[0] %arr[1]==0 && arr[0] / arr[1] - arr[2] * arr[3] == 24) return true;
        if ( arr[0] %arr[1]==0 &&arr[2] % arr[3]==0 &&  arr[0] / arr[1] - arr[2] / arr[3] == 24) return true;

        if (arr[0] %arr[1]==0 && arr[0] / arr[1] * arr[2] + arr[3] == 24) return true;
        if ( arr[0] %arr[1]==0 &&arr[0] / arr[1] * arr[2] - arr[3] == 24) return true;
        if ( arr[0] %arr[1]==0 &&arr[0] / arr[1] * arr[2] * arr[3] == 24) return true;
        if (arr[0] %arr[1]==0 &&arr[2] % arr[3]==0 &&arr[0] / arr[1] * arr[2] / arr[3] == 24) return true;

        if (  arr[0] / arr[1] / arr[2] + arr[3] == 24) return true;
        if (arr[0] / arr[1] / arr[2] - arr[3] == 24) return true;
        if (arr[0] / arr[1] / arr[2] * arr[3] == 24) return true;
        if (arr[0] / arr[1] / arr[2] / arr[3] == 24) return true;

        return false;
    }
}
