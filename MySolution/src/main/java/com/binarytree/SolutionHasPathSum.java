package com.binarytree;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/29
 */
public class SolutionHasPathSum {

    public boolean hasPathSum(TreeNode root,int sum){
        if (root==null)return false;
        //每遍历一个节点就将本节点的值减去
        //如果到了叶子节点发现sum为0就表示找到了一条路径
        sum=sum-root.val;
        //判断当前节点是否为叶子节点，如果为叶子节点就判断sum是否为0
        if (root.left==null && root.right==null)
            return sum==0;
        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }
}
