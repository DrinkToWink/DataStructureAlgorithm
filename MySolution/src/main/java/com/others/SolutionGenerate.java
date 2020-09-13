package com.others;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/29
 */
public class SolutionGenerate {

    public static List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> lists = new ArrayList<List<Integer>>();
        if (numRows == 0) return lists;

        //初始化第一行的数据为1
        lists.add(new ArrayList<>());
        lists.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            //本行的数据集合
            ArrayList<Integer> list = new ArrayList<>();
            //添加本行的第一个值
            list.add(1);
            //拿到前一行的集合
            List<Integer> preRow = lists.get(i - 1);
            for (int i1 = 1; i1 < preRow.size(); i1++) {
                //相加规律
                int num = preRow.get(i1 - 1) + preRow.get(i1);
                //放入集合中依次往后增加
                list.add(num);
            }
            //添加本行的最后一个值
            list.add(1);
            //将本行添加到lists中
            lists.add(list);
        }
        return lists;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = generate(5);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer+",");
            }
            System.out.println();
        }
    }
}
