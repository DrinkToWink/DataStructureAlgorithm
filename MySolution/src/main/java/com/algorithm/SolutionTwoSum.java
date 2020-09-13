package com.algorithm;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/5
 */
public class SolutionTwoSum {

    @Test
    public void test() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums, target));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer value = target - nums[i];
            if (map.containsKey(value) && (Integer) map.get(value) != i && i<(Integer) map.get(value)) {
                return new int[]{i, (Integer) map.get(value)};
            }
        }
        return null;
    }

}
