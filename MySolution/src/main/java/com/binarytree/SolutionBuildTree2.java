package com.binarytree;

import java.util.HashMap;

/**
 * @author: 一个小菜逼
 * @Date: 2020/5/1
 *
 * 根据后续遍历和中序遍历构造二叉树，注意：并不是二叉搜索树
 */
public class SolutionBuildTree2 {

    public static HashMap<Integer,Integer> map=new HashMap<>();
    public static int post_index;

    public static TreeNode buildTree2(int[] inorder,int[] postorder){
        post_index=postorder.length-1;
        int in_index=0;
        for (int i : inorder) {
            map.put(i,in_index++);
        }
        return helper(0,inorder.length-1,inorder,postorder);
    }

    public static TreeNode helper(int left,int right,int[] inOrder,int[] postOrder){
        if (left>right)return null;
        int rootNodeVal = postOrder[post_index--];
        Integer in_index = map.get(rootNodeVal);
        TreeNode rootNode = new TreeNode(rootNodeVal);
        rootNode.right=helper(in_index+1,right,inOrder,postOrder);
        rootNode.left=helper(left,in_index-1,inOrder,postOrder);
        return rootNode;
    }

    public static void main(String[] args) {
        int[] inorder={9,3,15,20,7};
        int[] postorder={9,15,7,20,3};
        buildTree2(inorder,postorder);
    }
}
