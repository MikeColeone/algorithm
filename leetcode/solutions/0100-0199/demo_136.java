package com.method;

import java.util.HashMap;
import java.util.Map;

public class demo_136 {
}
//class Solution {
//    public int singleNumber(int[] nums) {
//        Map<Integer, Integer> freq = new HashMap<>();
//        for (int num : nums) {
//            freq.put(num, freq.getOrDefault(num, 0) + 1);
//        }
//
//        // 再次遍历数组，输出只出现一次的元素（保持原始顺序）
//        for (int num : nums) {
//            if (freq.get(num) == 1) {
//                return num;
//            }
//        }
//        return -1;
//    }
//}


//class Solution {
//    public int singleNumber(int[] nums) {
//        int ans = 0;
//        for (int num: nums){
//            ans^=num;
//        }
//        return ans;
//    }
//}