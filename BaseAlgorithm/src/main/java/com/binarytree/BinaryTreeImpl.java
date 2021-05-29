package com.binarytree;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImpl implements BinaryTree {

    Node rootNode;

    public BinaryTreeImpl(Node rootNode) {
        this.rootNode = rootNode;
    }

    public BinaryTreeImpl() {
    }


    //前序遍历
    public void preOrderTravel(Node rootNode) {
        if (rootNode != null) {
//			System.out.print(rootNode.value+" ");
//			BinaryTreeImpl leftTree = new BinaryTreeImpl(rootNode.leftNode);
//			leftTree.preOrderTravle();
//			BinaryTreeImpl rightTree = new BinaryTreeImpl(rootNode.rightNode);
//			rightTree.preOrderTravle();	
            System.out.print(rootNode.value + " ");
            preOrderTravel(rootNode.leftNode);
            preOrderTravel(rootNode.rightNode);
        }
    }


    //中序遍历
    public void midOrderTravel(Node rootNode) {
        if (rootNode != null) {
            midOrderTravel(rootNode.leftNode);
            System.out.print(rootNode.value + " ");
            midOrderTravel(rootNode.rightNode);
        }
    }


    //后序遍历
    public void behOrderTravel(Node rootNode) {
        if (rootNode != null) {
            behOrderTravel(rootNode.leftNode);
            behOrderTravel(rootNode.rightNode);
            System.out.print(rootNode.value + " ");
        }
    }


    //层次遍历（广度优先遍历）
    public void levelOrderTravel(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(rootNode);
        while (queue.size() != 0) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node temp = queue.poll();
                System.out.print(temp.value + " ");
                //如果当前节点的左右节点都不为null，分别将左右节点放入队列中
                if (temp.leftNode != null) {
                    queue.add(temp.leftNode);
                }
                if (temp.rightNode != null) {
                    queue.add(temp.rightNode);
                }
            }
        }
    }


    //深度优先遍历
    public void midOrderByStack(Node rootNode) {
        Deque<Node> stack = new LinkedList<Node>();
        Node currentNode = rootNode;
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.leftNode;
            }
            if (!stack.isEmpty()) {
                currentNode = stack.pop();
                System.out.print(currentNode.value + " ");
                currentNode = currentNode.rightNode;
            }
        }
    }


    //获得二叉树的高度
    public int getHight(Node rootNode) {
        if (rootNode == null) {
            return 0;
        } else {
            int leftHight = getHight(rootNode.leftNode);
            int rightHight = getHight(rootNode.rightNode);
            return leftHight > rightHight ? leftHight + 1 : rightHight + 1;
        }
    }


    //二叉树所有的节点
    public int getNodes(Node rootNode) {
        if (rootNode == null) {
            return 0;
        } else {
            int leftNodes = getNodes(rootNode.leftNode);
            int rightNodes = getNodes(rootNode.rightNode);
            return leftNodes + rightNodes + 1;
        }
    }


    //查找指定的值
    public Node findValue(Object value, Node rootNode) {
        if (rootNode == null) {
            return null;
        } else {
            if (rootNode != null && rootNode.value == value) {
                return rootNode;
            } else {
                Node leftFindValue = findValue(value, rootNode.leftNode);
                Node rightFindValue = findValue(value, rootNode.rightNode);
                if (leftFindValue != null && leftFindValue.value == value) {
                    return leftFindValue;
                }
                if (rightFindValue != null && rightFindValue.value == value) {
                    return rightFindValue;
                } else {
                    return null;
                }
            }
        }
    }


    public static void main(String[] args) {
        //构造二叉树
        Node node5 = new Node(5, null, null);
        Node node4 = new Node(4, null, node5);
        Node node3 = new Node(3, null, null);
        Node node7 = new Node(7, null, null);
        Node node6 = new Node(6, null, node7);
        Node node2 = new Node(2, node3, node6);
        Node node1 = new Node(1, node4, node2);
        BinaryTreeImpl bTree = new BinaryTreeImpl();
        System.out.println("前序遍历结果为：");
        bTree.preOrderTravel(node1);
        System.out.println();
        System.out.println("中序遍历结果为：");
        bTree.midOrderTravel(node1);
        System.out.println();
        System.out.println("后序遍历结果为：");
        bTree.behOrderTravel(node1);
        System.out.println();
        //System.out.println("数的高度为："+bTree.getHight(node1));
        //System.out.println("树中共有多少节点："+bTree.getNodes(node1));
        //System.out.println("查询值的结果为："+bTree.findValue(6, node1));
        System.out.println("层次遍历（广度优先遍历）结果为");
        bTree.levelOrderTravel(node1);
        System.out.println();
        System.out.println("深度优先遍历结果为：");
        bTree.midOrderByStack(node1);
        System.out.println();
    }


}
