//package com.method;
//
//import java.util.Arrays;
//
///*移动0双指针*/
//public class demo_283 {
//    public static void main(String[] args) {
//        int[] arr = {1,2,4,7,0,0};
//
//        Solution solution = new Solution();
//        solution.moveZeroes(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//}
//
//
//class Solution {
//    public void moveZeroes(int[] nums) {
//        int n = nums.length;
//        int l = 0, r = 0;
//        while(r<n){
//            int t = 0;
//            if(nums[r]!=0){
//                t = nums[r];
//                nums[r] = nums[l];
//                nums[l] = t;
//                l++;
//            }
//            r++;
//        }
//
//    }
//}
