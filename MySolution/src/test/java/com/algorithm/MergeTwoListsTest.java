package com.algorithm;

import java.util.List;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/21
 */
public class MergeTwoListsTest {

    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if (l1==null)return l2;
        if (l2==null)return l1;
        //判断哪个链表的头结点比较小，哪个比较小就将哪个链表的头结点作为新链表的头结点
        if (l1.val<=l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
        if (l1.val>l2.val){
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
        return null;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val=x;
    }
}
