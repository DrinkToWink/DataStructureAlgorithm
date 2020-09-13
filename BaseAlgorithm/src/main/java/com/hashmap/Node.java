package com.hashmap;

public class Node {
    public int hash;
    public Object key;
    public Object value;
    public Node nextNode;
    public Node(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
    public Node() {
    }
}
