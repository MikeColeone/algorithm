//package com.method;
//
//
///*滑动窗口最大值*/
//public class demo_239 {
//}
//
//
//class Solution {
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        int n = nums.length;
//        int i = 0, j = 0;
//        int[] res = new int[n - k + 1];
//
//
//    }
//
//
//    public int maxSlidingWindow2(int[] nums) {
//        int n = nums.length;
//        int max = nums[0];
//        for (int i = 0; i < n; i++) {
//            max = Math.max(max, nums[i]);
//        }
//        return max;
//    }
//}