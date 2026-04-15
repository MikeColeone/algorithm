package com.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class demo_128 {
}
// 排序回家等通知写法
//class Solution {
//    public int longestConsecutive(int[] nums) {
//        if (nums.length == 0) return 0;
//
//        Arrays.sort(nums);
//        int current = 1; // 初始序列长度为1
//        int max = 1;
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i + 1]) {
//                continue; // 跳过重复值
//            } else if (nums[i + 1] == nums[i] + 1) {
//                current++; // 连续数字，增加长度
//            } else {
//                // 不连续，重置 current
//                max = Math.max(max, current); // 更新最大值
//                current = 1;
//            }
//        }
//
//        // 循环结束后再更新一次 max，避免遗漏最后一段
//        return Math.max(max, current);
//    }
//}
