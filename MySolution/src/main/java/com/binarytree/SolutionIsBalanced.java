package com.binarytree;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/26
 */
public class SolutionIsBalanced {

    public boolean isBalanced(TreeNode root){
        if (root==null)return true;
        //左子树跟右子树之差的绝对值小于2，左子树为平衡树，右子树为平衡树
        //都满足的话，就返回true，反之，返回false
        return Math.abs(treeHight(root.left)-treeHight(root.right))<2 &&
                isBalanced(root.left) && isBalanced(root.right);
    }

    //判断树的高度
    public int treeHight(TreeNode root){
        if (root==null)return 0;
        int leftHight= treeHight(root.left);
        int rightHight=treeHight(root.right);
        return Math.max(leftHight,rightHight)+1;
    }
}