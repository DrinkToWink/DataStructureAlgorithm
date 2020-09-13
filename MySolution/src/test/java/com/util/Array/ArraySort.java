package com.util.Array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @User xiangyl
 * @Data 2020/8/22
 */
public class ArraySort {
    
    public static void main(String[] args) {
        int[][] nums={{2,1},{3,2},{3,3},{1,1}};
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1]>o2[1])return -1;
                if (o1[1]<o2[1])return 1;
                if (o1[0]>o2[0])return 1;
                if (o1[0]<o2[0])return -1;
                return 0;
            }
        });

        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < 2; i1++) {
                System.out.print(nums[i][i1]+" ");
            }
            System.out.println();
        }
    }




}
