package com.leetcode;

import com.sun.xml.internal.bind.marshaller.NoEscapeHandler;

/**
 * @User 小菜鸡
 * @Data 2020/7/4
 */
public class Node {

    public int val;
    public Node next;
    public Node random;

    public Node(int val){
        this.val=val;
        this.next=null;
        this.random=null;
    }
}
