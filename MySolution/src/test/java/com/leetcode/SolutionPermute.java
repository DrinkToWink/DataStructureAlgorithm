package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @User 小菜鸡
 * @Data 2020/7/5
 *
 * 全排列问题；注意：这个答案并不对，只是为了帮助自己理解的，现在理解都没有理解...很尴尬
 */
public class SolutionPermute {

    public List<List<Integer>> permute(int[] nums){
        // 首先是特判
        int len = nums.length;
        // 使用一个动态数组保存所有可能的全排列
        List<List<Integer>> res = new ArrayList<>();

        if (len == 0) {
            return res;
        }

        boolean[] used = new boolean[len];
        List<Integer> path = new ArrayList<>();

        dfs(nums, len, 0, path, used, res);
        return res;


    }

    private void dfs(int[] nums, int len, int depth,
                     List<Integer> path, boolean[] used,
                     List<List<Integer>> res) {
        if (depth == len) {
            res.add(path);
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;

                dfs(nums, len, depth + 1, path, used, res);
                // 注意：这里是状态重置，是从深层结点回到浅层结点的过程，代码在形式上和递归之前是对称的
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }


    public static void main(String[] args) {
        SolutionPermute sp = new SolutionPermute();
        int[] nums = {1, 2, 3};
        List<List<Integer>> lists = sp.permute(nums);
        System.out.println(lists);
    }
}
