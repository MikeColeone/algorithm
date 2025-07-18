//package com.method;
//
//import java.util.HashMap;
//
///*和为 K 的子数组*/
//public class demo_560 {
//
//}
//
////class Solution {
////    public int subarraySum(int[] nums, int k) {
////        int count = 0;
////        for (int i = 0; i < nums.length; i++) {
////            int sum = 0;
////            for (int j = i; j < nums.length; j++) {
////                sum += nums[j];
////                if (sum == k) {
////                    count++;
////                }
////            }
////        }
////        return count;
////    }
////}
//
//
//
////哈希
//class Solution {
//    public int subarraySum(int[] nums, int k) {
//       int count = 0,pre=0;
//       HashMap<Integer,Integer> map = new HashMap<>();
//       map.put(0,1);
//       for (int i = 0; i < nums.length; i++) {
//           pre += nums[i];
//           if(map.containsKey(pre-k)){
//               count += map.get(pre-k);
//           }
//           map.put(pre,map.getOrDefault(pre,0)+1);
//       }
//
//       return count;
//    }
//}