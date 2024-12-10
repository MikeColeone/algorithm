//package com.method;
//
//public class demo_633 {
//}
//
//
//class Solution {
//    public boolean judgeSquareSum(int c) {
//        //双指针便利
//        long r = (int)Math.sqrt(c);
//        long l = 0;
//
//        while(l<=r){
//            long temp = r*r + l*l;
//            if(temp==c) return true;
//            else if(temp>c){
//                r--;
//            }
//            else{
//                l++;
//            }
//        }
//        return false;
//    }
//}
//
//
//////煞笔 int存不下爆超时
////class Solution {
////    public boolean judgeSquareSum(int c) {
////        if(c==0) return true;
////        for (long i = 0;i*i<c;i++){
////            long j = c-i*i;
////            double t = Math.sqrt(j);
////            if(t==(int)t) return true;
////        }
////        return false;
////    }
////}
//
//
