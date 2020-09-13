package com.niuke;

import com.others.ListNode;
import java.util.ArrayList;

/**
 * @User 小菜鸡
 * @Data 2020/5/21
 */
public class SolutionPrintList {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode!=null){
            list.add(0,listNode.val);
            listNode=listNode.next;
        }
        return list;
    }
}
