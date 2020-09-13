package com.binarytree;

import java.util.Timer;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/25
 */
public class SolutionIsSymmetric {

    public boolean isSymmetric(TreeNode root){
        return myIsSymmetric(root,root);
    }

    public boolean myIsSymmetric(TreeNode left,TreeNode right){
        if (left==null && right==null)return true;
        if (left==null || right==null)return false;
        if (left.val!=right.val)return false;
        return myIsSymmetric(left.left, right.right) &&
                myIsSymmetric(left.right,right.left);
    }
}
