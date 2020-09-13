package com.algorithm;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/26
 */
public class MyClass {

    public int myClaa() {
        Scanner sc = new Scanner(System.in);
        int ints = sc.nextInt();
        for (int i = 0; i < ints; i++) {
            int anInt = sc.nextInt();
            for (int i1 = 0; i1 < anInt; i1++) {
                Scanner sc2 = new Scanner(System.in);
                String s = sc2.nextLine();
                LinkedList<Integer> integers = new LinkedList<>();
                String[] s1 = s.split(" ");
                if (s1[0] == "PUSH") {
                    integers.add(Integer.parseInt(s1[1]));
                } else if (s1[0] == "POP") {
                    Integer poll = integers.poll();
                    if (poll == null) {
                        return -1;
                    }
                    System.out.println(poll);
                } else if (s1[0] == "TOP") {
                    Integer peek = integers.peek();
                    if (peek == null) return -1;
                    System.out.println(peek);
                } else if (s1[0] == "SIZE") {
                    int size = integers.size();
                    System.out.println(size);
                } else {
                    integers.clear();
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myClaa();
    }
}
