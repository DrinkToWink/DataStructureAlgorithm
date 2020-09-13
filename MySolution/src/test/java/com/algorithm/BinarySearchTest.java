package com.algorithm;


import com.binarytree.TreeNode;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/26
 */
public class BinarySearchTest {

    public void binarySearch(TreeNode root){
        if (root==null)return;
        binarySearch(root.left);
        System.out.println(root.val);
        binarySearch(root.right);
    }
}

