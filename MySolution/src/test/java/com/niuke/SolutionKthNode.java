package com.niuke;

import com.binarytree.TreeNode;

/**
 * @User xiangyl
 * @Data 2020/7/18
 */
public class SolutionKthNode {

    private int count=0;
    private int index=0;

    public TreeNode kthNode(TreeNode pRoot,int k){
        if (pRoot==null || k==0)return null;
        nodeNum(pRoot);
        if (k>count)return null;
        TreeNode[] treeNodes=new TreeNode[count];
        sortNode(pRoot,treeNodes);
        return treeNodes[k - 1];
    }

    public void nodeNum(TreeNode root){
        if (root==null)return;
        count++;
        nodeNum(root.left);
        nodeNum(root.right);
    }

    public void sortNode(TreeNode root,TreeNode[] treeNodes){
        if (root==null)return;
        sortNode(root.left,treeNodes);
        treeNodes[index++]=root;
        sortNode(root.right,treeNodes);
    }

    public static void main(String[] args) {
        SolutionKthNode solutionKthNode = new SolutionKthNode();
        TreeNode node1 = new TreeNode(8);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(10);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(9);
        TreeNode node7 = new TreeNode(11);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;
        TreeNode treeNode = solutionKthNode.kthNode(node1,0);
        System.out.println(treeNode);
    }
}
