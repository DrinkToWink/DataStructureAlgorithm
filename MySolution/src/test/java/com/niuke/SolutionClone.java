package com.niuke;

import java.util.HashMap;

/**
 * @User 小菜鸡
 * @Data 2020/5/27
 */
public class SolutionClone {

    public static RandomListNode clone(RandomListNode phead){
        RandomListNode headNode=phead;
        RandomListNode curNode=phead;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        while (curNode!=null){
            RandomListNode cloneNode = new RandomListNode(curNode.label);
            map.put(curNode,cloneNode);
            curNode=curNode.next;
        }
        while (headNode!=null){
            RandomListNode cloneNode = map.get(headNode);
            cloneNode.next = headNode.next==null?null:map.get(headNode.next);
            cloneNode.random=headNode.random==null?null:map.get(headNode.random);
            headNode=headNode.next;
        }
        return map.get(phead);
    }

    public static void main(String[] args) {
        //{1,2,3,4,5,3,5,#,2,#}
        RandomListNode head = new RandomListNode(1);
        RandomListNode second = new RandomListNode(2);
        RandomListNode third = new RandomListNode(3);
        head.next=second;
        second.next=third;
        RandomListNode clone = clone(head);
        while (clone!=null){
            System.out.println(clone.label);
            clone = clone.next;
        }
    }

}
