package com.binarytree;

import java.util.*;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/25
 * 二叉树的广度优先遍历（BFS）
 */
public class SolutionLevelOrderBottom {

    //广度优先遍历，基本思想就是，从队列取出当前节点，将当前节点数据放入list集合中，然后将
    //下一层的节点放入队列中
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
        if (root == null) return list;
        //LinkedList继承了队列，也可以当做队列来使用
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //将节点放到队列尾部
        queue.add(root);
        //当队列为空的时候说明，节点已经遍历完了
        while (!queue.isEmpty()) {
            //给每一层定义一个list集合，来存放数据
            ArrayList<Integer> integers = new ArrayList<Integer>();
            Integer len= queue.size();
            for (int i = 0; i < len; i++) {
                //取出队列的头节点
                TreeNode pop = queue.poll();
                //将队列头节点的值放入集合中，每一层都会有一个List集合
                integers.add(pop.val);
                //将数据放入队列中，这里如果使用栈的话，会造成节点的覆盖
                //如果使用栈：当前节点的子节点会覆盖掉与当前节点相邻的右节点，本来遍历完当前节点后
                //应该遍历与当前节点相邻的右节点，结果会遍历当前节点的子节点，顺序会错乱
                if (pop.left!=null){
                    //将节点放在队列尾部
                    queue.add(pop.left);
                }
                if(pop.right!=null){
                    //将节点放在队列尾部
                    queue.add(pop.right);
                }
            }
            //在索引为0的位置放入每层集合，则每次的结果都会放在索引为0的位置
            //这样的话，最后的元素就会放在最前面
            list.add(0,integers);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode leftSon = new TreeNode(4);
        TreeNode rightSon = new TreeNode(5);
        left.left=leftSon;
        right.right=rightSon;
        root.left=left;
        root.right=right;
        List<List<Integer>> lists = levelOrderBottom(root);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer+",");
            }
        }
    }
}
