package com.binarytree;

public interface BinaryTree {

	void preOrderTravel(Node rootNode);

	void midOrderTravel(Node rootNode);

	void behOrderTravel(Node rootNode);
	
	int getHight(Node rootNode);
	
	int getNodes(Node rootNode);
	
	Node findValue(Object value, Node rootNode);
	
	void levelOrderTravel(Node rootNode);
	
	void midOrderByStack(Node rootNode);

}
