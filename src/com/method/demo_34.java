package com.method;

public class demo_34 {
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        if(nums==null) return ans;
        int flag=0;
        for (int i = 0;i<nums.length;i++){
            if(nums[i]==target&&flag==0){
                ans[0]= i;
                System.out.println(i);
                flag=1;
            }
            //不能取不同的值的前一个 只能每一次赋值
//用例：            [1] 1
            if(flag==1&&nums[i]==target){
                ans[1] = i;
            }
        }

        return ans;
    }
}