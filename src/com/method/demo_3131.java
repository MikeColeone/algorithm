//package com.method;
//import java.util.*;
//public class demo_3131 {
//
//    public static void main(String[] args) {
//        int[] arr1 = new int[105];
//        int[] arr2 = new int[105];
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            arr1[i] = sc.nextInt();
//        }
//        int m = sc.nextInt();
//        for (int i = 0; i < m; i++) {
//            arr2[i] = sc.nextInt();
//        }
//        Solution p = new Solution();
//        int ans = p.addedInteger(arr1,arr2);
//        System.out.println(ans);
//    }
//}
//
//
//class Solution {
//    public int addedInteger(int[] nums1, int[] nums2) {
//        return Arrays.stream(nums2).min().getAsInt() - Arrays.stream(nums1).min().getAsInt();
//    }
//}
