//package com.method;
//
//
///*接雨水*/
//public class demo_42 {
//
//    public static void main(String[] args) {
//        int[] arr = new int[]{4,2,0,3,2,5};
//        Solution solution = new Solution();
//        int ans = solution.trap(arr);
//        System.out.println(ans);
//    }
//}
////class Solution {
////    public int trap(int[] height) {
////        int ans = 0;
////        int max = maxInArr(height); // 找到最大的高度，以便遍历。
////        for (int i = 1; i <= max; i++) {
////            boolean isStart = false;
////            int tempSum = 0;
////            for (int j = 0; j < height.length; j++) {
////                if (height[j] >= i) {
////                    if (isStart) {
////                        System.out.println(tempSum);
////                        ans += tempSum;
////                        tempSum = 0;
////                    }
////                    isStart = true;
////                } else {
////                    if (isStart) {
////                        tempSum++;
////                    }
////                }
////            }
////        }
////        return ans;
////    }
////
////    private int maxInArr(int[] height) {
////        int max = 0;
////        for (int j : height) {
////            max = Math.max(max, j);
////        }
////        return max;
////    }
////
////
////}
//
////class Solution {
////    public int trap(int[] height) {
////        int l = 0, r = height.length - 1;
////        int lMax = 0, rMax = 0;
////        int ans = 0;
////
////        while (l < r) {
////            if (height[l] < height[r]) {
////                if (height[l] >= lMax) {
////                    lMax = height[l];
////                } else {
////                    System.out.println(ans);
////                    ans += lMax - height[l];
////                }
////                l++;
////            } else {
////                if (height[r] >= rMax) {
////                    rMax = height[r];
////                } else {
////                    ans += rMax - height[r];
////                }
////                r--;
////            }
////        }
////        return ans;
////    }
////}
//
//
//class Solution {
//
//    public int trap(int[] height) {
//        int ans = 0;
//
//        int max = maxInArr(height);//找到最大的高度，以便遍历。
//        for (int i = 1; i <= max; i++) {
//
//            int l = 0;
//            int r = 0;
//            int count = 0;
//            int flag = 0;
//            for (int j = 0; j < height.length; j++) {
//
//                if(height[j]>=i){
//                    count++;
//                    if(count==1) l=j;
//                    if(count==2){
//                        flag=1;
//                        r = j;
//                    }
//                }
//                if(flag==1){
//                    flag =0 ;
//                    ans += (r-l-1);
//                    System.out.println(l+" "+r);
//                    l = r;
//                    count = 1; //下次只更新r
//                }
//
//
//            }
//        }
//        return ans;
//    }
//    private int maxInArr(int[] height) {
//        int max = 0;
//        for (int j : height) {
//            max = Math.max(max, j);
//        }
//        return max;
//    }
//
//}
