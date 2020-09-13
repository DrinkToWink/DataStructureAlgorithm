package com.niuke;

import java.util.Stack;

/**
 * @User 小菜鸡
 * @Data 2020/5/24
 */
public class SolutionStack {

    private Stack<Integer> stackAll=new Stack<>();
    private Stack<Integer> stackMin=new Stack<>();

    public void push(int node){
        stackAll.push(node);
        if (stackMin.size()==0){
            stackMin.push(node);
        }else {
            if (node<=stackMin.peek()){
                stackMin.push(node);
            }else {
                stackMin.push(stackMin.peek());
            }
        }
    }

    public void pop(){
        stackAll.pop();
        stackMin.pop();
    }

    public int top(){
        return stackAll.peek();
    }

    public int min(){
        return stackMin.peek();
    }
}
