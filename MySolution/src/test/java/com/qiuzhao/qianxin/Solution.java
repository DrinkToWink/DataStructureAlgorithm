package com.qiuzhao.qianxin;

import java.util.ArrayList;
import java.util.List;

/**
 * @User xiangyl
 * @Data 2020/8/1
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a={1,1,2};
        int i = solution.reletive_7(a);
        System.out.println(i);
    }

    public int reletive_7 (int[] digit){
        int length = digit.length;
        int len = getNums(length);
        int[] ints = new int[len];
        boolean[] booleans = new boolean[length];
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        dfs(digit,length,0,lists,integers,booleans);
        System.out.println(lists);
        int count=0;
        for (int anInt : ints) {
            if (anInt%7==0){
                count++;
            }
        }
        return count;
    }

    public int getNums(int length){
        if (length==1)return 1;
        length=length*getNums(length-1);
        return length;
    }

    public void dfs(int[] nums, int len, int depth, List<ArrayList<Integer>> sbs, ArrayList sb,boolean[] used){
        if (len==depth){
            sbs.add(new ArrayList<>(sb));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!used[i]){
                sb.add(nums[i]);
                used[i]=true;
                dfs(nums,len,depth+1,sbs,sb,used);
                used[i]=false;
                sbs.remove(sb.size()-1);//删除最后一位字符
            }
        }

    }
}








