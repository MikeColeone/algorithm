package com.method;

public class demo_674 {
}

//class Solution {
//    public int findLengthOfLCIS(int[] nums) {
//        int ans = 0;
//        int n = nums.length;
//        int start = 0;
//        for (int i = 0; i < n; i++) {
//            if (i > 0 && nums[i] <= nums[i - 1]) {
//                start = i;
//            }
//            ans = Math.max(ans, i - start + 1);
//        }
//        return ans;
//    }
//}