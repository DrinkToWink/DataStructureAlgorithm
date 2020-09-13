package com.niuke;

import java.util.ArrayList;

/**
 * @User 小菜鸡
 * @Data 2020/5/24
 */
public class SolutionPrintMatrix {

    public static ArrayList<Integer> printMatrix(int[][] matrix){
        //用来存储遍历后的数据
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix==null ||matrix.length==0 || matrix[0].length==0)return list;
        int up=0;
        int down=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while (true){
            //输出第一行，up++
            for (int i = left; i <= right; i++) {
                list.add(matrix[up][i]);
            }
            up++;
            //判断是否越界，越界退出
            if (up>down)break;
            //输出最右边那一列，right--
            for (int i = up; i <= down; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            //判断是否越界，越界退出
            if (left>right) break;
            //输出最下面哪一行，down--
            for (int i = right; i >= left; i--) {
                list.add(matrix[down][i]);
            }
            down--;
            //判断是否越界，越界退出
            if (up>down)break;
            //输出最左边那一列，left++
            for (int i = down; i >= up; i--) {
                list.add(matrix[i][left]);
            }
            left++;
            //判断是否越界，越界退出
            if (left>right)break;
        }
        //返回遍历结果
        return list;
    }

    public static void main(String[] args) {
        int[][] ints = new int[2][2];
        ints[0][0]=1;
        ints[0][1]=2;
        ints[1][0]=3;
        ints[1][1]=4;
        ArrayList<Integer> integers = printMatrix(ints);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

}
