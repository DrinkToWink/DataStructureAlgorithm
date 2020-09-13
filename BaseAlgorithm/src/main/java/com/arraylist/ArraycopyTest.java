package com.arraylist;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/5
 */
public class ArraycopyTest {

    /**
     * System.arraycopy()方法的复制特点
     */
    @Test
    public void ArraycopyTest(){
        int[] a=new int[10];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        a[3]=3;
        //源数组，源数组的索引，目标数组，目标数组的索引，要复制的长度
        //注意：源数组和目标数组可以为同一个数组，也可以为不同的数组
        System.arraycopy(a,2,a,3,3);
        for (int i=0;i<a.length;i++){
            //结果：0 1 2 2 3 0 0 0 0 0
            System.out.print(a[i]+" ");
        }
    }

    /**
     * 扩容原数组为指定长度，是同一个数组，里面的内容不变，只是长度变了
     * 底层也是调用了System.arraycopy()方法
     */
    @Test
    public void arrayscopyOfTest(){
        int[] a=new int[3];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        int[] b= Arrays.copyOf(a,10);
        //结果：b.length:10
        System.out.println("b.length:"+b.length);
        for (int i=0;i<10;i++){
            //结果：0,1,2,0,0,0,0,0,0,0,
            System.out.print(b[i]+",");
        }
    }

}
