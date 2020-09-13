package com.niuke;

import com.others.ListNode;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author: 一个小菜逼
 * @Date: 2020/5/1
 */
public class SolutionArrayList {

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode==null)return list;
        LinkedList<ListNode> listNodes = new LinkedList<>();
        while (listNode!=null){
            listNodes.add(listNode);
            listNode=listNode.next;
        }
        while (!listNodes.isEmpty()){
            list.add(listNodes.pollLast().val);
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        ArrayList<Integer> list = printListFromTailToHead(listNode1);
        for (Integer integer : list) {
            System.out.print(integer+",");
        }
    }
}
