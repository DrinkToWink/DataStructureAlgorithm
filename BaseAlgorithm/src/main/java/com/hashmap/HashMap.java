package com.hashmap;

import org.junit.Test;

public class HashMap {
	
	Node table[];
	
    //初始化tabel数组的大小，为16
	public HashMap() {
		this.table = new Node[16];
	}

	//put方法
	public void put(Object key,Object value) {
		Node node = new Node(key,value);
		int hashValue=hash(node.key.hashCode(), table.length);
		//这个应该是报错的，不知道为啥不报错（知道原因了，整数的hashcode是自身）
		//int hashValue=hash((Integer)node.key, table.length);
		node.nextNode=null;
		Node tempNode=table[hashValue];
		Node lastNode=null;
		if (tempNode==null) {
			table[hashValue]=node;
		}while (tempNode!=null) {
			if (tempNode.key.equals(key)) {
				tempNode.value=value;
				break;
			}else {
				lastNode=tempNode;
				tempNode=tempNode.nextNode;
			}	
		}
		if (lastNode!=null) {
			lastNode.nextNode=node;
		}
	}

	//根据key获取value
	public Object get(Object key) {
		int hash=hash(key.hashCode(), table.length);
		Object value=null;
		if (table[hash]!=null) {
			Node temp=table[hash];
			while (temp!=null) {
				if (key.equals(temp.key)) {
					value=temp.value;
					break;
				}
				temp=temp.nextNode;
			}
		}
		return value;
	}

	//自定义的算法，获取hash值，为了获取数组的下标
	public int hash(int hash,int length) {
		return hash&(length-1);
	}
	
	//定义toString方法，便于打印HashMap对象
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder("{");
		for (int i = 0; i < table.length; i++) {
			Node temp=table[i];
			while (temp!=null) {
				stringBuilder.append(temp.key+":"+temp.value+",");
				temp=temp.nextNode;
			}
		}
		stringBuilder.setCharAt(stringBuilder.length()-1, '}');
		return stringBuilder.toString();
	}
	
	@Test
	public void test() {
		HashMap map = new HashMap();
		map.put(8, "AA");
		map.put(8, "BB");
		map.put(9, "CC");
		map.put(1, "DD");
		map.put(17, "dd");
		System.out.println(map.get(17));
		for (int i = 0; i < 20; i++) {
			System.out.println(i+"��hashΪ��"+hash(i, 16));
		}
	}
	
	
}
