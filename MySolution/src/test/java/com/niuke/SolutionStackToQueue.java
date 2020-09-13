package com.niuke;

import java.util.Stack;

/**
 * @User 小菜鸡
 * @Data 2020/5/22
 */
public class SolutionStackToQueue {

    private static Stack<Integer> stack1 = new Stack<Integer>();
    private static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {
        //出栈（队列）之前判断stack2中是否有数据，如果有先将stack2中的数据弹出
        if (stack2.size() < 1) {
            while (stack1.size() != 0) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(4);
        push(5);
        push(3);
        int value = pop();
        System.out.println(value);
    }

}
