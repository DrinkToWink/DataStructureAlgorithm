package com.niuke;

import java.util.HashMap;

/**
 * @User 小菜鸡
 * @Data 2020/7/6
 */
public class SolutionFindNumsAppearOnce {

    public void findNumsAppearOnce(int[] array,int[] num1,int[] num2){
        HashMap<Object, Object> map = new HashMap<>();
        for (int i : array) {
            if (map.containsKey(i)){
                map.remove(i);
            }else {
                map.put(i,i);
            }
        }
        int count=0;
        for (int i : array) {
            if (map.containsKey(i)){
                if (count==0){
                    num1[0]=(int) map.get(i);
                    count++;
                }else {
                    num2[0]=(int)map.get(i);
                }
            }
        }
        System.out.println(num1[0]);
        System.out.println(num2[0]);

    }

    public static void main(String[] args) {
        SolutionFindNumsAppearOnce sfn = new SolutionFindNumsAppearOnce();
        int[] ints={1,1,2,2,3,4};
        int[] num1=new int[1];
        int[] num2=new int[1];
        sfn.findNumsAppearOnce(ints,num1,num2);
    }
}
