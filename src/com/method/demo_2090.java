package com.method;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo_2090 {
}


class Solution {
    public int[] getAverages(int[] nums, int k) {

        int r = 0;
        long t = 0;
        int s = 2*k+1;

        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);

        if(k==0) {
            return nums;
        }
        if(s>nums.length){
            return ans;
        }

        for (int i = 0; i < s; i++) {
            t += nums[i];
        }

        // 从第 k 个元素开始计算
        for (int i = k; i < nums.length - k; i++) {
            ans[i] = (int) (t / s);  // 当前窗口的平均值
            // 移动窗口：减去左边元素，添加右边元素
            if (i + k + 1 < nums.length) {
                t += nums[i + k + 1] - nums[i - k];
            }
        }
        return ans;
    }
}



