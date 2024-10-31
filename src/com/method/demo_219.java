//package com.method;
//
//public class demo_219 {
//}
//
//class Solution {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        int length = nums.length;
//        for (int i = 0; i < length; i++) {
//            int num = nums[i];
//            map.put(num, i);
//        }
//
//        for (int i = 0;i<length;i++){
//            int t = i - map.get(nums[i]);
//            if ( Math.abs(t)<= k&&t!=0) {
//                return true;
//            }
//        }
//        return false;
//    }
//}
