package com.qiuzhao.meituan;

/**
 * @User 小菜鸡
 * @Data 2020/6/29
 */
public class Test {

    public static void main(String[] args) {
        int x=11;
        int y=6;
        int r=x^y;
        int count=0;
        while (r!=0){
            count++;
            r=r&(r-1);
        }
        System.out.println(count);
    }
}
