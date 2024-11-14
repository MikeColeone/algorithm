package com.method;

import java.util.Arrays;

public class demo_215 {
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        nums = Arrays.stream(nums).sorted().toArray();
        return nums[nums.length - k];
    }
}