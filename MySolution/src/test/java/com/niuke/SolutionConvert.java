package com.niuke;

import com.binarytree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @User 小菜鸡
 * @Data 2020/5/28
 */
public class SolutionConvert {

    List<TreeNode> list=new ArrayList<>();

    public TreeNode convert(TreeNode pRootOfTree){
        if (pRootOfTree==null)return null;
        helpConvert(pRootOfTree);
        for (int i = 0; i < list.size()-1; i++) {
            list.get(i).right=list.get(i+1);
            list.get(i+1).left=list.get(i);
        }
        return list.get(0);
    }

    public void helpConvert(TreeNode root){
        if (root==null)return;
        helpConvert(root.left);
        list.add(root);
        helpConvert(root.right);
    }
}
