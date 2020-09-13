package com.recursion;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/24
 */
public class SolutionDeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head){
        ListNode myHead=head;
        while (head!=null && head.next!=null){
            if (head.val==head.next.val){
                head.next=head.next.next;
            }else {
                head=head.next;
            }
        }
        return myHead;
    }
}
