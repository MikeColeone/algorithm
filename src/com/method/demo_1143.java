package com.method;


/*最长公共子序列*/
public class demo_1143 {
}


class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length(),n2 = text2.length();
        int[][] dp = new int[n1+1][n2+1];
        for (int i = 1;i<=n1;i++){
            char c1 = text1.charAt(i-1);
            for (int j = 1;j<=n2;j++){
                char c2 = text2.charAt(j-1);
                // if(i==0||j==0) dp[i][j] = 0;
                if(c1==c2) dp[i][j] = dp[i-1][j-1] + 1;
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
        return dp[n1][n2];
    }
}