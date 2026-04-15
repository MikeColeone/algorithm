//package com.method;
//
//import java.util.Arrays;
//
///*移动零*/
///*移动0双指针*/
//public class demo_283 {
//    public static void main(String[] args) {
//        int[] arr = {1,2,4,7,0,0,1};
//
//        Solution solution = new Solution();
//        solution.moveZeroes(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//}
//
////
////class Solution {
////    public void moveZeroes(int[] nums) {
////        int n = nums.length;
////        int l = 0, r = 0;
////        while(r<n){
////            int t = 0;
////            if(nums[r]!=0){
////                t = nums[r];
////                nums[r] = nums[l];
////                nums[l] = t;
////                l++;
////            }
////            r++;
////        }
////
////    }
////}
//class Solution {
//    public void moveZeroes(int[] nums) {
//        int n = nums.length;
//        int cur = 0;
//
//        for(int i = 0;i<n;i++){
//            if(nums[i]!=0){
//                nums[cur]=nums[i];
//                cur++;
//            }
//        }
//
//        for (int i = cur; i < n; i++) {
//            nums[i]=0;
//        }
//
//    }
//}