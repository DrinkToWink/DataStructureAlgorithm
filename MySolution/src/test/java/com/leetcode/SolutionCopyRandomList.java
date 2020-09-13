package com.leetcode;

import java.util.HashMap;

/**
 * @User 小菜鸡
 * @Data 2020/7/4
 */
public class SolutionCopyRandomList {

    public Node copyRandomList(Node head){
        HashMap<Node, Node> map = new HashMap<>();
        Node headNode=head;
        while (headNode!=null){
            map.put(headNode,new Node(headNode.val));
            headNode = headNode.next;
        }
        headNode=head;
        while (headNode!=null){
            Node cloneNode = map.get(headNode);
            cloneNode.next= headNode.next==null?null:map.get(headNode.next);
            cloneNode.random=headNode.random==null?null:map.get(headNode.random);
        }
        return map.get(head);
    }
}
