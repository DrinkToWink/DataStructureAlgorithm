package com.binarytree;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/25
 * 二叉树的深度优先遍历（DFS），使用递归来实现的；
 * 二叉树的广度优先遍历（BFS），使用队列来实现
 */
public class SolutionMaxDepth {

    public int maxDepth(TreeNode root){
        if (root==null)return 0;
        //当一个节点的左节点和右节点都为空的时候，会进行递归的第一次返回，返回1
        if (root.left==null && root.right==null)return 1;
        int max=Integer.MIN_VALUE;
        if (root.left!=null) max=Math.max(maxDepth(root.left),max);
        if (root.right!=null)max=Math.max(maxDepth(root.right),max);
        //max是左节点或者是右节点的最大值，加1就表示在加上本节点的深度
        return max+1;
    }
}
