package com.test;

import java.util.LinkedList;

/**
 * @User xiangyl
 * @Data 2020/7/18
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.addLast(1);
        integers.addLast(2);
        integers.addLast(3);
        integers.push(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.addLast(8);
        integers.addFirst(9);
        Integer peek = integers.peek();
        Integer peekFirst = integers.peekFirst();
        Integer peekLast = integers.peekLast();
        Integer pollFirst = integers.pollFirst();
        Integer poll = integers.poll();
        Integer pollLast = integers.pollLast();
        Integer pop = integers.pop();

    }
}
