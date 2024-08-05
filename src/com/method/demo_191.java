//package com.method;
//
//public class demo_191 {
//}
//class Solution {
//    public int hammingWeight(int n) {
//        int ans = 0;
//        while(n>0){
//            if(n%2==1){
//                ans++;
//            }
//            n/=2;
//        }
//        return ans;
//    }
//}
//////位运算优化 (n)&(n-1) 的结果恰好是n的最低位1化为0的结果
////class Solution {
////    public int hammingWeight(int n) {
////        int ans = 0;
////        while(n>0){
////            if(n%2==1){
////                ans++;
////            }
////            n/=2;
////        }
////        return ans;
////    }
////}