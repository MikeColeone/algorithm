//package com.method;
//
//public class demo_552 {
//}
//
//class Solution {
//    public int checkRecord(int n) {
//        final int MOD = 1000000007;
//        int[][] dp = new int[2][3]; // A 的数量，结尾连续 L 的数量
//        dp[0][0] = 1;
//        for (int i = 1; i <= n; i++) {
//            int[][] dpNew = new int[2][3];
//            // 以 P 结尾的数量
//            for (int j = 0; j <= 1; j++) {
//                for (int k = 0; k <= 2; k++) {
//                    dpNew[j][0] = (dpNew[j][0] + dp[j][k]) % MOD;
//                }
//            }
//            // 以 A 结尾的数量
//            for (int k = 0; k <= 2; k++) {
//                dpNew[1][0] = (dpNew[1][0] + dp[0][k]) % MOD;
//            }
//            // 以 L 结尾的数量
//            for (int j = 0; j <= 1; j++) {
//                for (int k = 1; k <= 2; k++) {
//                    dpNew[j][k] = (dpNew[j][k] + dp[j][k - 1]) % MOD;
//                }
//            }
//            dp = dpNew;
//        }
//        int sum = 0;
//        for (int j = 0; j <= 1; j++) {
//            for (int k = 0; k <= 2; k++) {
//                sum = (sum + dp[j][k]) % MOD;
//            }
//        }
//        return sum;
//    }
//}
