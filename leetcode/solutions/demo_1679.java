//package com.method;
//
//import java.util.HashMap;
//
//public class demo_1679 {
//}
//class Solution {
//    public int maxOperations(int[] nums, int k) {
//
//    }
//}
//
//
////数组移除元素转化为计数
//class Solution {
//    public int maxOperations(int[] nums, int k) {
//        int ans = 0;
//        HashMap<Integer, Integer> cnt = new HashMap<>();
//        for (int x : nums) {
//            int c = cnt.getOrDefault(k - x, 0);
//            if (c > 0) {
//                cnt.put(k - x, c - 1);
//                ans++;
//            } else {
//                cnt.merge(x, 1, Integer::sum);
//            }
//        }
//        return ans;
//    }
//}
//
