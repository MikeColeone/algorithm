//package com.method;
//
//public class demo_643 {
//    public static void main(String[] args) {
//        
//    }
//}
//
//
//class Solution {
//    public double findMaxAverage(int[] nums, int k) {
//        double sum = 0.0;
//        for (int i = 0;i<k;i++){
//            sum+=nums[i];
//        }
//        double ans = sum;
//        for (int i = k;i<nums.length;i++){
//            sum = sum - nums[i - k] +nums[i];
//            if(sum>ans) ans=sum;
//        }
//        return (ans)/k;
//    }
//}
//
//
