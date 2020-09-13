package com.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: 一个小菜逼
 * @Date: 2020/5/2
 *
 * 队列中放入节点的顺序没有变，都是从左往右，取出节点的顺序也没有变，都是取出队头节点
 * 唯一变的就是，奇数层，往集合里面放入遍历结果的时候从前往后放；
 * 偶数层，往集合里面放入遍历结果的时候是从后往前放;只是放入遍历结果的顺序变了而已
 * 奇数层、偶数层只是定义的一个标志，也可以用Boolean值代替，只是一个标志而已
 */
public class SolutionZigzagLevelOrder2 {

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List lists = new ArrayList<ArrayList<Integer>>();
        if (root==null) return lists;
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        int flag=1;
        while (!treeNodes.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int len = treeNodes.size();
            //遍历每一层
            for (int i = 0; i < len; i++) {
                //取出队头节点
                TreeNode head = treeNodes.pollFirst();
                //如果为奇数层就正着放数据
                if (flag%2==1)list.add(head.val);
                //如果是偶数层就反着放数据
                if (flag%2==0)list.add(0,head.val);
                if (head.left!=null)treeNodes.add(head.left);
                if (head.right!=null)treeNodes.add(head.right);
            }
            flag++;
           lists.add(list);
        }
        return lists;
    }
}
