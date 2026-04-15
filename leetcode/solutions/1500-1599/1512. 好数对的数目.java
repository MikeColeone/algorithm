package com.method;

import java.util.Arrays;

public class demo_1512 {
}

//class Solution {
//    public int numIdenticalPairs(int[] nums) {
//        // 排序数组
//        Arrays.sort(nums);
//        int ans = 0;
//        int count = 1;
//
//        // 遍历已排序的数组
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == nums[i - 1]) {
//                count++;
//            } else {
//                ans += counts(count);
//                count = 1; // 重置计数为1而不是0
//            }
//        }
//
//        // 处理最后一个元素的计数
//        ans += counts(count);
//
//        return ans;
//    }
//
//    public int counts(int n) {
//        if (n <= 1) return 0;
//        return (n - 1) * n / 2;
//    }
//}


//class Solution {
//    public int numIdenticalPairs(int[] nums) {
//        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
//        for (int num : nums) {
//            m.put(num, m.getOrDefault(num, 0) + 1);
//        }
//
//        int ans = 0;
//        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
//            int v = entry.getValue();
//            ans += v * (v - 1) / 2;
//        }
//
//        return ans;
//    }
//}
