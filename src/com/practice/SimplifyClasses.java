package com.practice;

import java.util.ArrayList;
import java.util.List;

public class SimplifyClasses {
    public static void main(String[] args) {
        //测试数据
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] nums2 = {1, 2, 3, 5, 6, 7, 8};
        int[] nums3 = {1, 2, 4, 6, 7, 8};
        int[] nums4 = {1};
        int[] nums5 = {1,2,3,5,6,8};
        int[] nums6 = {1,3,5,7,9};
        System.out.println(simplify(nums1));
        System.out.println(simplify(nums2));
        System.out.println(simplify(nums3));
        System.out.println(simplify(nums4));
        System.out.println(simplify(nums5));
        System.out.println(simplify(nums6));
    }

    public static String simplify(int[] nums) {
        if (nums.length == 0) return "";

        List<String> ans = new ArrayList<>();
        int l = 0; // 左指针指向区间起始
//        int r = 0; // 右指针用于扩展区间

//        while (r < nums.length) {
//            // 检查当前元素和下一个元素是否连续
//            if (r + 1 < nums.length && nums[r] + 1 == nums[r + 1]) {
//                r++;
//            } else {
//                // 当前区间结束，处理区间结果
//                ans.add(specification(nums[l], nums[r]));
//                r++; // 右指针前进
//                l = r; // 左指针移动到新区间的起点
//            }
//
//        }

        for (int i = 1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                ans.add(specification(nums[l],nums[i-1]));
                l = i;
            }
        }
        //循环结束 处理最后区间
        ans.add(specification(nums[l],nums[nums.length-1]));

        return String.join(", ", ans);
    }

    private static String specification(int l, int r) {
        return l == r ? String.valueOf(l) : l + "-" + r;
    }
}
