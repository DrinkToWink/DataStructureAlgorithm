package com.binarytree;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/29
 */
public class SolutionMinDepth {

    public int minDepth(TreeNode root){
        if (root==null) return 0;
        //第一次递归要保证root.left跟root.right都小于min，不然min永远都是初始值
        //如果min初始值为0，那么min永远都是最小的，所以返回的结果永远都是min+1==1
        int min=Integer.MAX_VALUE;
        if (root.left!=null){
            min=Math.min(minDepth(root.left),min);
        }
        if (root.right!=null){
            min=Math.min(minDepth(root.right),min);
        }
        return min+1;
    }

}
