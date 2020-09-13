package com.niuke;

import com.binarytree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @User 小菜鸡
 * @Data 2020/5/28
 */
public class SolutionPrint {

    public ArrayList<ArrayList<Integer>> print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot==null) return lists;
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.addLast(pRoot);
        boolean flag=true;
        while (linkedList.size()!=0){
            ArrayList<Integer> list = new ArrayList<>();
            int len = linkedList.size();
            for (int i = 0; i < len; i++) {
                TreeNode head = linkedList.pollFirst();
                if (flag){
                    list.add(head.val);
                }else {
                    list.add(0,head.val);
                }
                if (head.left!=null)linkedList.addLast(head.left);
                if (head.right!=null)linkedList.addLast(head.right);
            }
            flag=!flag;
            lists.add(list);
        }
        return lists;
    }
}
