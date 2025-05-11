//package com.method;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class demo_16.js {
//}
//class Solution {
//    public int threeSumClosest(int[] nums, int target) {
//        nums = Arrays.stream(nums).sorted().toArray();
//        int temp = Integer.MAX_VALUE;
//
//        int ans= 0;
//        for (int i = 0;i<nums.length;i++){
//            if(i>0&&nums[i]==nums[i-1]) continue;
//            int left = i+1;
//            int right = nums.length-1;
//            while(left<right){
//                while (left < right && nums[left] == nums[left + 1]) left++;
//                while (left < right && nums[right] == nums[right - 1]) right--;
//
//
//                int judge = target-nums[i]-nums[left]-nums[right];
//                if(judge==0) return target;
//               else if(judge>0){
//                    right--;
//                   if(Math.abs(temp)>Math.abs(judge)) {
//                       temp = judge;//存储 但是不能直接在judge加绝对值
//                       ans = nums[i]+nums[left]+nums[right];
//                   }
//
//                }
//               else if(judge<0){
//                    left++;
//                    if(Math.abs(temp)>Math.abs(judge)) {
//                        temp = judge;
//                        ans = nums[i]+nums[left]+nums[right];
//                    }
//                }
//            }
//        }
//        return ans;
//    }
//}