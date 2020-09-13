package com.binarytree;

public class Node {
	
	Object value;
	Node leftNode;
	Node rightNode;
	
	public Node() {}
	
	public Node(Object value, Node leftNode, Node rightNode) {
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
	
	@Override
	public String toString() {
		return "Node [value=" + value + ", leftNode=" + leftNode + ", rightNode=" + rightNode + "]";
	}
	
	

}
