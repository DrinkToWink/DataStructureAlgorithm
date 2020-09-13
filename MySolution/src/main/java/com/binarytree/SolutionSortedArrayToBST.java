package com.binarytree;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/25
 */
public class SolutionSortedArrayToBST {

    public static int[] nums;
    public static TreeNode sortedArrayToBST(int[] num){
        nums=num;
        return binarySearchTree(0,nums.length-1);
    }

    public static TreeNode binarySearchTree(int left,int right){
        if (left>right)return null;
        int mid=(left+right)/2;
        //取中间的作为根节点
        TreeNode root = new TreeNode(nums[mid]);
        root.left=binarySearchTree(left,mid-1);
        root.right=binarySearchTree(mid+1,right);
        return root;
    }

    public static void main(String[] args) {
        int[] ints={-10,-3,0,5,9};
        System.out.println(sortedArrayToBST(ints));
    }
}
