package com.method;

public class demo_3392 {
}


//3392. 统计符合条件长度为 3 的子数组数目
class Solution {
    public int countSubarrays(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i < n - 1; ++i) {
            if (nums[i] == (nums[i - 1] + nums[i + 1]) * 2) {
                ++ans;
            }
        }
        return ans;
    }
}


//改为/2时出错
//改为/2.0自动转化成浮点数触发
//class Solution {
//    public int countSubarrays(int[] nums) {
//        int n = nums.length;
//        int ans = 0;
//        for (int i = 1; i < n - 1; ++i) {
//            // 修改为 /2
//            if (nums[i] == (nums[i - 1] + nums[i + 1]) / 2) {
//                ++ans;
//            }
//        }
//        return ans;
//    }
//}