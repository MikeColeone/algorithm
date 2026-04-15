//package com.method;
//
//public class demo_50 {
//}
//class Solution {
//    public double myPow(double x, int n) {
//        if(n==0) return 1.0;
//        if(n>0) {
//            double y = myPow(x, n / 2);
//            return n % 2 == 0 ? y * y : y * y * x;
//        }
//        else{
//
//            double y = myPow(x, Math.abs(n / 2));
//            return 1/(n % 2 == 0 ? y * y : y * y * x);
//        }
//    }
//}
//优化写法
//class Solution {
//    public double myPow(double x, int n) {
//     return n>=0?quickPow(x,n):(1/quickPow(x,-n));
//    }
//
//    public double quickPow(double x,int n){
//        if(n==0) return 1.0;
//        double y = quickPow(x, n / 2);
//        return n % 2 == 0 ? y * y : y * y * x;
//    }
//}