package com.qiuzhao.jingdong;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/8/6
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i=n;i<=m;i++){
            StringBuilder str = new StringBuilder(i + "");
            for (int i1 = 0; i1 < str.length(); i1++) {
                StringBuilder str2 = new StringBuilder(i + "");
                StringBuilder stringBuilder = str2.deleteCharAt(i1);
                int i2 = Integer.parseInt(stringBuilder.toString());
                if (main.isOrNot(i2)){
                    count++;
                    System.out.print(i+" ");
                    break;
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }

    public boolean isOrNot(int n) {
        return isPrime(n) && isPalindrome(n);
    }

    //判断是否是素数
    public boolean isPrime(int target) {
        if (target<=3)return target>1;
        for (int i = 2; i <=(int)Math.sqrt(target); i++) {
            if (target % i == 0) {
                return false;
            }
        }
        return true;
    }


    //判断是否是回文数
    public boolean isPalindrome(int target) {
        if (target%10==0 && target!=0)return false;
        if (target < 10) return true;
        int res = 0;
        while (target > res) {
            res = target % 10 + 10 * res;
            target = target / 10;
        }
        if (target == res || target==res/10) return true;
        return false;
    }

}
