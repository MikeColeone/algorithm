package com.method;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class demo_2461 {
}
 

//class Solution {
//    public long maximumSubarraySum(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int totals = 0; // 统计窗口内不同元素的数量
//        long ans = 0; // 当前窗口的元素和
//
//        // 初始化窗口大小为 k
//        for (int i = 0; i < k; i++) {
//            int key = nums[i];
//            map.put(key, map.getOrDefault(key, 0) + 1);
//            if (map.get(nums[i]) == 1) totals++;
//            ans += nums[i];
//        }
//
//        long max = 0; // 用来记录最大子数组和
//
//        // 滑动窗口
//        for (int i = k; i < nums.length; i++) {
//            if (totals == k) {
//                max = Math.max(max, ans);
//            }
//
//            // 移除窗口最左侧元素
//            int removeElement = nums[i - k];
//            map.put(removeElement, map.get(removeElement) - 1);
//            if (map.get(removeElement) == 0) totals--; // 如果频率为0，减少不同元素计数
//
//            // 添加窗口右侧元素
//            int addElement = nums[i];
//            map.put(addElement, map.getOrDefault(addElement, 0) + 1);
//            if (map.get(addElement) == 1) totals++; // 新增不同元素计数
//
//            // 更新当前窗口的和
//            ans += nums[i] - nums[i - k];
//        }
//
//        // 最后一个窗口的检查
//        if (totals == k) {
//            max = Math.max(max, ans);
//        }
//
//        return max;
//    }
//}

class Solution{

}