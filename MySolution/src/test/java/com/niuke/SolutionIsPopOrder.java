package com.niuke;

import java.util.Stack;

/**
 * @User 小菜鸡
 * @Data 2020/5/24
 */
public class SolutionIsPopOrder {

    public static boolean isPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0 || popA.length == 0 || pushA.length != popA.length) return false;
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            int size = stack.size();
            if (popA[j]==stack.peek()){
                for (int i1 = 0; i1 < size; i1++) {
                    if (stack.peek() == popA[j]) {
                        stack.pop();
                        j++;
                    }else {
                        break;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] ints = new int[5];
        int[] ints1 = new int[5];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        ints[3] = 4;
        ints[4] = 5;
        ints1[0] = 5;
        ints1[1] = 4;
        ints1[2] = 3;
        ints1[3] = 2;
        ints1[4] = 1;
        System.out.println(isPopOrder(ints, ints1));
    }
}
