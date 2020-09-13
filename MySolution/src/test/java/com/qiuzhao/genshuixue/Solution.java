package com.qiuzhao.genshuixue;

/**
 * @User xiangyl
 * @Data 2020/8/7
 */

class Node{
    int data;
    Node next;
}
public class Solution {
    public static void main(String[] args) {
        Node n1_1 = new Node();
        n1_1.data=1;
        Node n1_2 = new Node();
        n1_2.data=2;
        Node n1_3 = new Node();
        n1_3.data=4;
        n1_1.next=n1_2;
        n1_2.next=n1_3;

        Node n2_1 = new Node();
        n2_1.data=1;
        Node n2_2 = new Node();
        n2_2.data=3;
        Node n2_3 = new Node();
        n2_3.data=4;
        n2_1.next=n2_2;
        n2_2.next=n2_3;
        Solution so = new Solution();
        Node newRootNode = so.mergeTwoLists(n1_1, n2_1);
        while (newRootNode!=null){
            System.out.println(newRootNode.data);
            newRootNode=newRootNode.next;
        }

    }

    public Node mergeTwoLists(Node n1,Node n2){
        if (n1==null)return n2;
        if (n2==null)return n1;
        if (n1.data>=n2.data){
            n2.next= mergeTwoLists(n2.next,n1);
            return n2;
        }
        else{
            n1.next=mergeTwoLists(n1.next,n2);
            return n1;
        }

    }
}
