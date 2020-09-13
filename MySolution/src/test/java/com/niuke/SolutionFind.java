package com.niuke;

/**
 * @User 小菜鸡
 * @Data 2020/5/21
 */
public class SolutionFind {

    //暴力解法，这方式太垃圾了
//    public static boolean find(int target,int[][] array){
//        for (int i = 0; i < array.length; i++) {
//            for (int i1 = 0; i1 < array[i].length; i1++) {
//                if (target==array[i][i1])
//                    return true;
//            }
//        }
//        return false;
//    }

    public static boolean find(int target, int[][] array) {
        if (array.length==0 || array[0].length==0)return false;
        int m = array.length - 1;
        int n=array[m].length;
        int i = 0;
        while (i < n && m > -1) {
            if (array[m][i] < target) {
                i++;
            } else if (array[m][i] > target) {
                m--;
            }else if(array[m][i]==target){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] ints = new int[4][4];
//        System.out.println(ints[1].length);
        ints[0][0]=1;
        ints[0][1]=2;
        ints[0][2]=8;
        ints[0][3]=9;
        ints[1][0]=2;
        ints[1][1]=4;
        ints[1][2]=9;
        ints[1][3]=12;
        ints[2][0]=4;
        ints[2][1]=7;
        ints[2][2]=10;
        ints[2][3]=13;
        ints[3][0]=6;
        ints[3][1]=8;
        ints[3][2]=11;
        ints[3][3]=15;
        System.out.println(find(7,ints));

    }
}
