package com.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: 一个小菜逼
 * @Date: 2020/5/1
 */
public class SolutionLevleOrder {

    public static List<List<Integer>> levelOrder(TreeNode root){
        List lists = new ArrayList<ArrayList<Integer>>();
        if (root==null)return lists;
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            int len = treeNodes.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                //取出对头元素
                TreeNode head = treeNodes.poll();
                list.add(head.val);
                if (head.left!=null)treeNodes.add(head.left);
                if(head.right!=null)treeNodes.add(head.right);
            }
            lists.add(list);
        }
        return lists;
    }
}
