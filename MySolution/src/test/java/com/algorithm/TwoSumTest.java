package com.algorithm;

import java.util.HashMap;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/21
 */
public class TwoSumTest {

    public int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            int suplus=target-nums[i];
            if (map.containsKey(suplus) && map.get(suplus)>i){
                return new int[]{i,map.get(suplus)};
            }
        }
        return null;
    }
}
