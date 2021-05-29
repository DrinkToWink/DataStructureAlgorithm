package com.test;

import com.binarytree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @User xiangyl
 * @Data 2021/5/26
 */
public class TreeTest {

    public static void main(String[] args) {
    }

    //广度优先
    public static void look(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                System.out.println(poll.val);
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
        }
    }


    //深度优先
    public static void look2(TreeNode root) {
        if (root == null) return;
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode curNode = root;
        stack.push(root);
        while (curNode != null || stack.size() != 0){
            while (curNode != null){
                stack.push(curNode);
                curNode = curNode.left;
            }
            if (!stack.isEmpty()){
                TreeNode pop = stack.pop();
                System.out.println(pop.val);
                curNode = curNode.right;
            }
        }
    }
}
