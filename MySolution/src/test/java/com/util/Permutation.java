package com.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/8/2
 *
 * 回溯法，全排列
 */
public class Permutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i]=sc.nextInt();
        }
        Permutation per = new Permutation();
        List<List<Integer>> lists = per.permute(ints);
        System.out.println(lists);
    }

    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> lists = new ArrayList<>();
        int len=nums.length;
        if (len<=0)return lists;
        boolean[] used = new boolean[len];
        ArrayList<Integer> path = new ArrayList<>();
        dfs(nums,len,0,path,used,lists);
        return lists;
    }


    public void dfs(int[] nums,int len,int depth,List<Integer> path,
                    boolean[] used,List<List<Integer>> res){
        if (depth==len){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!used[i]){
                path.add(nums[i]);
                used[i]=true;
                dfs(nums,len,depth+1,path,used,res);
                used[i]=false;
                path.remove(path.size()-1);
            }
        }
    }

}
