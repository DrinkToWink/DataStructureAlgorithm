package com.niuke;

import com.others.ListNode;
import java.util.ArrayList;

/**
 * @User 小菜鸡
 * @Data 2020/5/23
 */
public class SolutionReverseList {

    public static ListNode reverseList(ListNode head){
        if (head==null)return null;
        ArrayList<ListNode> list = new ArrayList<>();
        while (head!=null){
            list.add(0,head);
            head=head.next;
        }
        int num=list.size();
        int i = 0;
        for (; i < num-1; i++) {
            list.get(i).next=list.get(i+1);
        }
        list.get(i).next=null;
        return list.get(0);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        head.next=head1;
        head1.next=head2;
        ListNode head0 = reverseList(head);
        while (head0!=null){
            System.out.println(head0.val);
            head0=head0.next;
        }
    }
}
