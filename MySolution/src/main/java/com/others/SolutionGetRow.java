package com.others;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/29
 */
public class SolutionGetRow {

    public static List<Integer> getRow(int rowIndex) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        if (rowIndex == 0) {
            List list0 = new ArrayList<Integer>();
            list0.add(1);
            return list0;
        }
        lists.add(new ArrayList<Integer>());
        lists.get(0).add(1);
        for (int i = 1; i <= rowIndex; i++) {
            List list = new ArrayList<Integer>();
            list.add(1);
            List<Integer> preRow = lists.get(i - 1);
            for (int i1 = 1; i1 < preRow.size(); i1++) {
                int num = preRow.get(i1 - 1) + preRow.get(i1);
                list.add(num);
            }
            list.add(1);
            lists.add(list);
        }
        return lists.get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
