package com.binarytree;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/7
 */
public class MyBinary {

    boolean data;
    MyBinary left;
    MyBinary right;

    public MyBinary() {
    }

    public MyBinary(boolean data) {
        this.data = data;
    }

    public void createNewNode(boolean data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    //后序遍历
    public MyBinary behindSearch(MyBinary root) {
        if (root != null) {
            MyBinary left = behindSearch(root.left);
            MyBinary right = behindSearch(root.right);
            if (left.data==true && right.data==true){
                root.data=true;
                return root;
            }else{
                root.data=false;
                return root;
            }
        }
            return root;
    }

    public static void main(String[] args) {
        MyBinary root = new MyBinary();
        MyBinary leftNode= new MyBinary();
        leftNode.createNewNode(true);
        MyBinary righttNode= new MyBinary();
        righttNode.createNewNode(true);
        root.left=leftNode;
        root.right=righttNode;
        MyBinary testInstance= new MyBinary();
        MyBinary testResult= testInstance.behindSearch(root);
        if (testInstance!=null)
        System.out.println(testResult.data);
        System.out.println("false");
    }
}
