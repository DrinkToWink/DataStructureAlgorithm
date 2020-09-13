package com.niuke;

import com.binarytree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @User xiangyl
 * @Data 2020/7/18
 */
public class SolutionPrint2 {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot==null)return lists;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.addLast(pRoot);
        while (nodes.size()!=0){
            int count = nodes.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                TreeNode head = nodes.pollFirst();
                list.add(head.val);
                if (head.left!=null)nodes.addLast(head.left);
                if (head.right!=null)nodes.addLast(head.right);
            }
            lists.add(list);
        }
        return lists;
    }
}
