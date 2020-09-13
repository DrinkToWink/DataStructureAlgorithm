package com.binarytree;

import com.others.ListNode;
import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 一个小菜逼
 * @Date: 2020/5/1
 *
 * 相关总结：有序数组（相当于中序遍历）、有序链表（相当于中序遍历）、前序遍历和中序遍历、后序遍历和中序遍历
 * 使用这些条件来构建平衡二叉树时，核心思想都是一样的，都是先找到根节点，
 * 根节点左边的为左子树，根节点右边的为右子树，递归左子树和右子树从而创建平衡二叉树
 * 值得注意的是，当只有中序遍历（有序数组、有序链表），那么构建的平衡二叉树不是唯一的
 */
public class SolutionSortListToBST {

    public static TreeNode sortedListToBST(ListNode head){
        if (head==null)return null;
        return helper(head,null);
    }

    public static TreeNode helper(ListNode head,ListNode tail){
        if (head==tail)return null;
        ListNode slow=head;
        ListNode fast=head;
        //当链表节点数量为奇数，跳出while循环时，slow为整个链表的中点
        //当链表节点数量为偶数，跳出while循环时，slow为整个链表的靠后的中点
        //如果有4个节点，slow就是第3个节点，如果有6个节点，slow就是第4个节点
        //fast跳出循环时，可能指向的是最后一个节点，也可能是最后一个节点的后一个节点
        //也就是说，fast可能不为空（指向最后一个节点），可能为null（指向最后一个节点的后一个节点）
        while (fast!=tail && fast.next!=tail){
            slow=slow.next;
            fast=fast.next.next;
        }
        int midValue = slow.val;
        TreeNode root = new TreeNode(midValue);
        root.left=helper(head,slow);
        root.right=helper(slow.next,tail);
        return root;
    }

    //这种解法效率太低了，因为这种解法的本质就是遍历链表，将链表中的值放入集合中，把集合当做数组来使用
    //集合中的序列就相当于是搜索树的中序遍历，之前那个题是直接给出中序遍历的数组，这种解法不推荐，了解就行了
    //其实这两种算法的本质差别就是，查找根节点的效率不一样，上面那个是直接遍历链表，链表中间的那个节点就是根节点
    //而这个是将链表节点的值放入集合，根据集合中的索引找到根节点，所以效率会比较低
    static List<Integer> list=null;
    public static TreeNode sortedListToBST2(ListNode head){
        if (head==null)return null;
        list = new ArrayList<>();
        //将链表节点的值都放入list集合中
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }
        return helper2(0,list.size()-1);
    }

    public static TreeNode helper2(int low_index,int high_index){
        if (low_index>high_index)return null;
        int mid_index=(low_index+high_index)/2;
        Integer rootVal = list.get(mid_index);
        TreeNode root = new TreeNode(rootVal);
        root.left=helper2(low_index,mid_index-1);
        root.right=helper2(mid_index+1,high_index);
        return root;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(-10);
        ListNode listNode2 = new ListNode(-3);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(9);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        //TreeNode treeNode = sortedListToBST(listNode1);
        TreeNode treeNode = sortedListToBST2(listNode1);
        System.out.println(treeNode);
    }
}
