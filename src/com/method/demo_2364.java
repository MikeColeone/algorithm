//package com.method;
//
//import java.util.HashMap;
//
//public class demo_2364 {
//}
//
////坏数对数目
////哈希表模式
//class Solution {
//    public long countBadPairs(int[] nums) {
//        HashMap<Integer, Integer> mp = new HashMap<>();
//        long res = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int key = nums[i] - i;
//            res += i - mp.getOrDefault(key, 0);
//            mp.put(key, mp.getOrDefault(key, 0) + 1);
//        }
//        return res;
//    }
//}