package com.arraylist;

import java.util.Arrays;
import org.junit.Test;

public class ArrayList {

	Object[] elementDate;
	private int size;
	private final int DEFAULTVALUE = 4;

	public ArrayList() {
		super();
		this.elementDate = new Object[DEFAULTVALUE];
	}

	public void add(Object value) {
		grow();
		elementDate[size] = value;
		size++;
	}

	public void add(int index, Object value) {
		grow();
		for (int j = size; j > index - 1; j--) {
			elementDate[j] = elementDate[j - 1];
		}
		elementDate[index] = value;
		elementDate[size] = value;
		size++;
	}

	public Object get(int index) {
		if (index >= elementDate.length) {
			throw new MyRuntimeException("����Խ��");
		}
		return elementDate[index];
	}

	// ���鶯̬���ݣ�Ĭ��һ������2
	private void grow() {
		if (size == elementDate.length) {
//			Object[] newobjeObjects=new Object[elementDate.length+(DEFAULTVALUE>>1)];
//			for (int i = 0; i < elementDate.length; i++) {
//				newobjeObjects[i]=elementDate[i];
//			}
//			elementDate=newobjeObjects;
			// ������������һ�δ��빦��һ����ʵ������Ķ�̬����
			elementDate = Arrays.copyOf(elementDate, elementDate.length + (DEFAULTVALUE >> 1));
		}
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		StringBuilder builder=new StringBuilder("[");
		for (int i=0;i<size;i++) {
			builder.append(elementDate[i]+",");
		}
		builder.setCharAt((builder.length()-1), ']');
		return builder.toString();
	}
	
	@Test
	public void test() {
		ArrayList arrayList = new ArrayList();
		arrayList.add("aaa");
		arrayList.add("bbb");
		arrayList.add("ccc");
		arrayList.add(3, "hhh");
		arrayList.add("ddd");
		System.out.println(arrayList.getSize());
		arrayList.add("eee");
		arrayList.add("fff");
		arrayList.add("ggg");
		System.out.println(arrayList.getSize());
		System.out.println(arrayList.get(3));
		System.out.println(arrayList);
	}
}
