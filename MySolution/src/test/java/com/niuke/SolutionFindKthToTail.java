package com.niuke;

import com.others.ListNode;

import java.util.HashMap;

/**
 * @User 小菜鸡
 * @Data 2020/5/23
 */
public class SolutionFindKthToTail {

    public static ListNode findKthToTail(ListNode head,int k){
        if (head==null || k==0)return null;
        HashMap<Integer, ListNode> map = new HashMap<>();
        Integer position=1;
        int lenth=0;
        while (head!=null){
            lenth++;
            map.put(position++,head);
            head=head.next;
        }
        int index=lenth+1-k;
        return k<=lenth?map.get(index):null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(3);
        head.next=head2;
        head2.next=head3;
        System.out.println(findKthToTail(head, 4).val);
    }
}
