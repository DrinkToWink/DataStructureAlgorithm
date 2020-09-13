package com.niuke;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @User xiangyl
 * @Data 2020/8/10
 */
public class SolutionGetLeastNumbers {

    public static void main(String[] args) {
        int[] a={4,5,1,6,2,7,3,8};
        System.out.println(getLeastNumbers(a,4));
    }

    public static ArrayList<Integer> getLeastNumbers(int[] input,int k){
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }
}
