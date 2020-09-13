package com.niuke;

import com.binarytree.TreeNode;
import java.util.HashMap;

/**
 * @User 小菜鸡
 * @Data 2020/5/22
 *
 * 牛客网的题，使用某个类时，不要忘记import 不然会报错
 */
public class SolutionReConsttuctBinaryTree {

    private static HashMap<Integer, Integer> map = new HashMap<>();
    private static int position=0;

    public static TreeNode reConstructBinaryTree(int[] pre,int[] in){
        //将中序遍历的序列放入map集合中，便于取出
        for (int i = 0; i < in.length; i++) {
            map.put(in[i],i);
        }
        TreeNode root = constructBinaryTree(pre, in, 0, in.length - 1);
        return root;
    }

    public static TreeNode constructBinaryTree(int[] pre,int[] in,int left,int right){
        if (left>right)return null;
        //从前往后依次取出一个前序遍历序列的结果
        int value=pre[position++];
        //创建跟节点
        TreeNode root = new TreeNode(value);
        //取出前序遍历的值在中序遍历中的索引
        Integer in_index = map.get(value);
        root.left=constructBinaryTree(pre,in,left,in_index-1);
        root.right=constructBinaryTree(pre,in,in_index+1,right);
        return root;
    }
}
