package com.binarytree;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/25
 */
public class SolutionIsSameTree {

    public boolean isSameTree(TreeNode p,TreeNode q){
        if (p==null && q==null)return true;
        if (p==null || q==null)return false;
        if (p.val!=q.val)return false;
        return isSameTree(p.left,q.left) &&
                isSameTree(p.right,q.right);
    }
}

