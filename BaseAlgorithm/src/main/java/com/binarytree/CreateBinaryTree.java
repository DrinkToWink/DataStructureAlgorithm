package com.binarytree;

/**
 * 树的构造、树的三种遍历
 */
public class CreateBinaryTree {

    int data;
    CreateBinaryTree left;
    CreateBinaryTree right;

    //初始化二叉树时
    public CreateBinaryTree(int data) {
        createNewNode(data);
    }

    public CreateBinaryTree() {
    }

    //创建新节点
    public void createNewNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    //传入数据，构造二叉树
    public void structBinaryTree(CreateBinaryTree root,int data){
        if(root!=null){
            if (data<root.data){
                if (root.left==null){
                    root.left=new CreateBinaryTree(data);
                }else {
                    structBinaryTree(root.left,data);
                }
            }else if(data>root.data){
                if (root.right==null){
                    root.right=new CreateBinaryTree(data);
                }else{
                    structBinaryTree(root.right,data);
                }
            }
        }else {
            return;
        }
    }

    //前序遍历
    public void preSearch(CreateBinaryTree root){
        if (root!=null){
            System.out.print(root.data+" ");
            preSearch(root.left);
            preSearch(root.right);
        }
    }

    //中序遍历
    public void midSearch(CreateBinaryTree root){
        if (root!=null){
            midSearch(root.left);
            System.out.print(root.data+" ");
            midSearch(root.right);
        }
    }

    //后序遍历
    public void behindSearch(CreateBinaryTree root){
        if (root!=null){
            behindSearch(root.left);
            behindSearch(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        CreateBinaryTree createBinaryTree = new CreateBinaryTree();
        int data[]={5,4,3,6,7,10,2,1,8,15,0};
        CreateBinaryTree root = new CreateBinaryTree(data[0]);
        for (int i=1;i<data.length;i++){
            createBinaryTree.structBinaryTree(root,data[i]);
        }
        //中序遍历
        createBinaryTree.midSearch(root);
        System.out.println();
        //前序遍历
        createBinaryTree.preSearch(root);
        System.out.println();
        //后序遍历
        createBinaryTree.behindSearch(root);
    }



}
