////package com.method;
////
////import java.util.Arrays;
////
////public class demo_1031 {
////}
//class Solution {
//    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
////左a右b
//        int[] t = new int[2];
//        int max1 = 0, max2 = 0;
//        t = w(nums,firstLen,nums.length);
//        max1 += t[0];
//        t = w(nums,secondLen,t[1]);
//        max1 += t[0];
//
//        t = w(nums,secondLen, nums.length);
//        max2 += t[0];
//        t=w(nums,secondLen, t[1]);
//        max2 += t[0];
//
//        return Math.max(max1,max2);
//
//    }
//
//    public int[] w(int[] nums, int k,int n) {
//        int max = Integer.MIN_VALUE;
//        int ans = 0;
//        int temp = 0;
//        ans+=max;
//        int i =0;
//        for (i = 0;i<n;i++){
//            temp+=nums[i];
//            if(i<k-1) continue;
//
//            if(temp>ans){
//                ans = temp;
//            }
//            temp-=nums[i-k];
//        }
//        System.out.print(ans+" ");
//        System.out.println(i-k+1);
//        return new int[]{ans,i-k+1};
//    }
//}