package com.niuke;

import com.binarytree.TreeNode;

/**
 * @User 小菜鸡
 * @Data 2020/5/22
 */
public class SolutionTreeDepth {

    public int treeDepth(TreeNode root){
        if (root==null)return 0;
        int leftHigh = treeDepth(root.left);
        int rightHigh=treeDepth(root.right);
        return leftHigh>rightHigh?leftHigh+1:rightHigh+1;
    }
}
