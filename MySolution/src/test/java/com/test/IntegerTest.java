package com.test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @User 小菜鸡
 * @Data 2020/7/4
 */
public class IntegerTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        Integer next = iterator.next();
        iterator.remove();
        System.out.println(iterator.next());
    }
}
