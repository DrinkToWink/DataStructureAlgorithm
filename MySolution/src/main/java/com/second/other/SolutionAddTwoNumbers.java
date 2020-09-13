package com.second.other;

import com.others.ListNode;

/**
 * @author: 一个小菜逼
 * @Date: 2020/5/2
 */
public class SolutionAddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //保存新链表的头节点的前一个节点，便于后续的返回，不然无法返回新链表的头节点
        ListNode pre=new ListNode(0);
        ListNode cur=pre;
        //初始化商为0
        int merchant=0;
        while(l1!=null || l2!=null){
            //判断每次过来都判断l1的值是否为null如果为null那么就令这个位置的数为0
            //目的就是为了，保证两个链表的数字位数相同，长度不相等的话就会在缺少的位置补0
            int val1=l1==null?0:l1.val;
            int val2=l2==null?0:l2.val;
            //相加的结果为当前两个节点的值加上前一个的商
            //因为链表是反着储存的，所以链表从头节点开始相加相当于原数从末尾开始相加
            int sum=val1+val2+merchant;
            //判断相加的结果是否大于9，如果>9说明往后进1,两个数相加的结果最多大于10不会超过20
            merchant=sum>9?1:0;
            sum=sum%10;
            cur.next = new ListNode(sum);
            //cur每次后移一位
            cur=cur.next;
            //判断当前节点是否还有下一位
            if (l1!=null){
                l1=l1.next;
            }if (l2!=null){
                l2=l2.next;
            }
        }
        //如果最末尾的两个数相加大于等于10，则再往后补一位
        if (merchant==1)cur.next=new ListNode(1);
        //因为链表中存储的数值是反着的，而要求输出的结果也是反着的，所以就不需要进行什么反转了，直接相加就完事了
        return pre.next;
    }

    public static void main(String[] args) {
//        ListNode listNode1 = new ListNode(2);
//        ListNode listNode2 = new ListNode(4);
//        ListNode listNode3 = new ListNode(3);
//        ListNode listNode4 = new ListNode(5);
//        ListNode listNode5 = new ListNode(6);
//        ListNode listNode6 = new ListNode(4);
//        listNode1.next=listNode2;
//        listNode2.next=listNode3;
//        listNode4.next=listNode5;
//        listNode5.next=listNode6;
//        System.out.println(addTwoNumbers(listNode1,listNode4));

//        ListNode listNode1 = new ListNode(1);
//        ListNode listNode2 = new ListNode(8);
//        ListNode listNode3 = new ListNode(0);
//        listNode1.next=listNode2;
//        System.out.println(addTwoNumbers(listNode1,listNode3));

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(8);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(8);
        ListNode listNode6 = new ListNode(0);
        ListNode listNode7 = new ListNode(1);
        ListNode listNode8 = new ListNode(8);
        ListNode listNode9 = new ListNode(0);
    }
}
