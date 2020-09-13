package com.binarytree;

import java.util.HashMap;

/**
 * @author: 一个小菜逼
 * @Date: 2020/5/1
 *
 * 根据前序遍历和中序遍历来构建二叉树
 */
public class SolutionBuildTree {

    public static HashMap<Integer, Integer> map = new HashMap<>();
    public static int pre_index=0;

    public static TreeNode buildTree(int[] preorder,int[] inorder){
        int position=0;
        for (int i : inorder) {
            map.put(i,position++);
        }
        return helper(0,inorder.length-1,preorder,inorder);
    }

    public static TreeNode helper(int left,int right,int[] preOrder,int[] inOrder){
        if (left>right)return null;
        int rootNodeVal=preOrder[pre_index++];
        Integer in_index = map.get(rootNodeVal);
        TreeNode rootNode = new TreeNode(rootNodeVal);
        rootNode.left=helper(left,in_index-1,preOrder,inOrder);
        rootNode.right= helper(in_index+1,right,preOrder,inOrder);
        return rootNode;
    }

    public static void main(String[] args) {
        int[] preOrder={3,9,20,15,7};
        int[] inOrder={9,3,15,20,7};

    }
}
