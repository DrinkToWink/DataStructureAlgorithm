package com.niuke;

/**
 * @User 小菜鸡
 * @Data 2020/5/23
 */
public class SolutionReOrderArray {

    public static void reOrderArray(int[] array){
        int length = array.length;
        int[] odd = new int[(length + 1) / 2];
        int odd_index=0;
        int[] even=new int[(length + 1) / 2];
        int even_index=0;
        for (int i = 0; i < length; i++) {
            if (array[i]%2==1)odd[odd_index++]=array[i];
            else even[even_index++]=array[i];
        }
        System.arraycopy(odd,0,array,0,odd_index);
        System.arraycopy(even,0,array,odd_index,even_index);
    }

    public static void main(String[] args) {
        int[] ints = new int[4];
        ints[0]=1;
        ints[1]=2;
        ints[2]=3;
        ints[3]=4;
        reOrderArray(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
