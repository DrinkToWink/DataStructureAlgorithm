package com.others;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/30
 */
public class SolutionHasCycle {

    public boolean hasCycle(ListNode head){
        //传过来的节点为null或者只有一个节点
        if (head==null || head.next==null) return false;
        ListNode slow=head;
        ListNode fast=head.next;
        //当快指针追上慢指针的时候，说明链表已经成了环,如果成环肯定会有一个时间点可以追上
        //就相两个运动员在环形操场跑步一样，快的肯定会有一天可以追上慢的
        while (fast!=slow){
            //快指针一次并不是走一步，所以会有两种情况
            if (fast==null || fast.next==null)return false;
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
}
