package com.method;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 两数之和 */
public class demo_1 {
   public static void main(String[] args) {
       int[] nums = {3, 2, 4};
       Solution solution = new Solution();
       int[] ans = solution.twoSum(nums, 6);
       System.out.println(Arrays.toString(ans)); // 输出 [1, 2]
   }
}

class Solution {
   public int[] twoSum(int[] nums, int target) {
       // 使用 HashMap 存储数组元素及其索引
       Map<Integer, Integer> map = new HashMap<>();

       // 遍历数组
       for (int i = 0; i < nums.length; i++) {
           // 计算目标值与当前元素的差值
           int t = target - nums[i];

           // 检查差值是否已经在 HashMap 中
           if (map.containsKey(t)) {
               return new int[]{map.get(t), i};
           }
           map.put(nums[i], i);
       }

       return new int[0];
   }
}
