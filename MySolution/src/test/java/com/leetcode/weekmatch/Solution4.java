package com.leetcode.weekmatch;

import java.util.ArrayList;
import java.util.List;

/**
 * @User xiangyl
 * @Data 2020/8/23
 */
public class Solution4 {

    public static void main(String[] args) {
//        int[] nums={1,3,5,7};
//        System.out.println(mostVisited(7,nums));
        int[] ints={2,1,2,1,2,1,2,1,2};
        System.out.println(mostVisited(2, ints));
    }

    /**
     * 因为最后一位肯定也要算上，所以右边一定得是一个闭区间，for循环的变量也得是一个闭区间，
     *
     * @param n
     * @param rounds
     * @return
     */
    public static List<Integer> mostVisited(int n,int[] rounds){
        int[] ints = new int[n+1];
        ints[rounds[0]]++;
        for (int i = 0; i < rounds.length-1;i++) {
            if (rounds[i+1]>rounds[i]){
                for (int i1 = rounds[i]+1; i1 <= rounds[i + 1]; i1++) {
                    ints[i1]++;
                }
            }else {
                for (int i1 = rounds[i]+1; i1 <= n ; i1++) {
                    ints[i1]++;
                }
                for (int i1 = 1; i1 <=rounds[i + 1]; i1++) {
                    ints[i1]++;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int max=0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]>=max){
                max=ints[i];
            }
        }
        //因为数组的索引就是扇形区域，而且数组的遍历又是按照索引，所以遍历数组的时候，扇形区域已经被排序好了
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]==max){
                list.add(i);
            }
        }
        return list;
    }
}
