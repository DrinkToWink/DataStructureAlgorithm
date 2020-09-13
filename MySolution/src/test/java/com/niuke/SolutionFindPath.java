package com.niuke;

import com.binarytree.TreeNode;
import java.util.ArrayList;

/**
 * @User 小菜鸡
 * @Data 2020/5/26
 */
public class SolutionFindPath {

    private ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        if (root == null) return lists;
        //创建节点保存遍历结果
        ArrayList<Integer> list = new ArrayList<Integer>();
        helpFindPath(list, root, target);
        return lists;
    }

    public void helpFindPath(ArrayList<Integer> list, TreeNode root, int target) {
        if (root == null) return;
        list.add(root.val);
        //如果当前节点为叶子节点(该节点的左右节点都为null)，且target==root.val
        if (root.left == null && root.right == null && target == root.val) {
            //将遍历的结果复制到新数组里面，并保存到lists中
            lists.add(new ArrayList<>(list));
        }
        target = target - root.val;
        helpFindPath(list, root.left, target);
        helpFindPath(list, root.right, target);
        //将list中存放的当前节点的值删去
        list.remove(list.size() - 1);
    }
}
