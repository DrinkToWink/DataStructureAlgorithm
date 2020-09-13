package com.second.other;

import com.binarytree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @User 小菜鸡
 * @Data 2020/5/27
 */
public class SolutionPathSum {

    List<List<Integer>> lists =new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root,int sum){
        if (root==null) return lists;
        ArrayList<Integer> list = new ArrayList<>();
        helpPathSum(list,root,sum);
        return lists;
    }

    public void helpPathSum(ArrayList<Integer> list,TreeNode root,int sum){
        if (root==null)return;
        list.add(root.val);
        if (root.left==null && root.right==null && root.val==sum){
            lists.add(new ArrayList<>(list));
        }
        sum=sum-root.val;
        helpPathSum(list,root.left,sum);
        helpPathSum(list,root.right,sum);
        //将当前节点在list中保存的结果移除，也就是回溯法
        list.remove(list.size()-1);
    }
}
