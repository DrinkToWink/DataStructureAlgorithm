package com.niuke;

import com.binarytree.TreeNode;

/**
 * @User 小菜鸡
 * @Data 2020/5/23
 */
public class SolutionHasSubtree {

    public static boolean hasSubtree(TreeNode root1,TreeNode root2){
        if (root1==null || root2==null)return false;
        return doSubtree(root1,root2) ||
                hasSubtree(root1.left,root2) || hasSubtree(root1.right,root2);
    }

    public  static boolean doSubtree(TreeNode root1,TreeNode root2){
        //这个表示，root2所有节点已经遍历完了
        if (root2==null)return true;
        //若root2还没有遍历完，但是root1已经遍历完了，说明root2节点多余root1(子节点)，则返回false
        else if (root1==null)return false;
        //节点数值不同返回false
        else if (root1.val!=root2.val){
            return false;
        }
        //递归判断
        return doSubtree(root1.left,root2.left) && doSubtree(root1.right,root2.right);
    }
}
