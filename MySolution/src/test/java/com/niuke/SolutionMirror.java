package com.niuke;

import com.binarytree.TreeNode;
import java.util.LinkedList;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/30
 */
public class SolutionMirror {

    //递归实现：深度优先遍历
    public void Mirror(TreeNode root){
        if (root==null) return;
        TreeNode nodeTemp=root.left;
        root.left=root.right;
        root.right=nodeTemp;
        Mirror(root.left);
        Mirror(root.right);
    }

    //队列来实现：广度优先遍历,这个运行失败不知道哪里出问题了
    public static void mirror2(TreeNode root){
        if (root==null)return;
        LinkedList<TreeNode> treeNodes = new LinkedList<TreeNode>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            int len = treeNodes.size();
            for (int i = 0; i < len; i++) {
                TreeNode head = treeNodes.poll();
                TreeNode nodeTemp=head.left;
                head.left=head.right;
                head.right=nodeTemp;
                if (head.left!=null){
                    treeNodes.add(head.left);
                }else if(head.right!=null){
                    treeNodes.add(head.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        mirror2(treeNode);
    }
}
