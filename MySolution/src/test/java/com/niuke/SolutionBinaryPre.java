package com.niuke;

import com.binarytree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @User 小菜鸡
 * @Data 2020/5/24
 */
public class SolutionBinaryPre {

    public static ArrayList<Integer> printFromTopToBottom(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        if (root==null)return list;
        LinkedList<TreeNode> queue = new LinkedList<>();
        //添加到队尾
        queue.addLast(root);
        while (queue.size()!=0){
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                //取出队头元素，跟poll()、pop()一样，pop一般用于栈，poll一般用于队列
                TreeNode headNode = queue.pollFirst();
                list.add(headNode.val);
                //添加到队尾
                if (headNode.left!=null)queue.addLast(headNode.left);
                if (headNode.right!=null)queue.addLast(headNode.right);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(6);
        root.left=left;
        root.right=right;
        ArrayList<Integer> list = printFromTopToBottom(root);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
