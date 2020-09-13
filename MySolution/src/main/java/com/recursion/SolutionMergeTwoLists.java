package com.recursion;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/18
 */
public class SolutionMergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2;
        }
         if (l2==null){
            return l1;
        }
        if (l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        ListNode l101 = new ListNode(1);
        ListNode l102 = new ListNode(2);
        ListNode l103 = new ListNode(5);
        l101.next=l102;
        l102.next=l103;
        ListNode l201 = new ListNode(0);
        ListNode l202 = new ListNode(3);
        ListNode l203 = new ListNode(4);
        l101.next=l202;
        l202.next=l203;
        ListNode listNode = mergeTwoLists(l101, l201);
        System.out.println(listNode.val);
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }

}
