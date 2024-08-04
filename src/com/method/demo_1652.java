//package com.method;
//
//public class demo_1652 {
//
//}

//暴力求解
//class Solution {
//    public int[] decrypt(int[] code, int k) {
//        if (k==0) {
//            for (int i = 0;i< code.length;i++) code[i] = 0;
//            return code;
//        }
//        int[] ans = new int[code.length];
//        if(k>0)
//            for (int i = 0;i<code.length;i++){
//                for (int j = 1;j<=k;j++){
//                    ans[i]+=code[(i+j)%code.length];
//                }
//            }
//        else{
//            for (int i = code.length-1;i>=0;i--){
//                for (int j = -1;j>=k;j--){
//                    if(i+j<0)
//                    ans[i]+=code[(i+j)%code.length+code.length];
//                    else{
//                        ans[i]+=code[(i+j)%code.length];
//                    }
//                }
//            }
//        }
//        return ans;
//    }
//}


//前缀和
//class Solution {
//    public int[] decrypt(int[] code, int k) {
//        int n = code.length;
//        int[] ans = new int[n];
//        if (k == 0) return ans;
//        int[] sum = new int[n * 2 + 10];
//        for (int i = 1; i <= 2 * n; i++) sum[i] += sum[i - 1] + code[(i - 1) % n];
//        for (int i = 1; i <= n; i++) {
//            if (k < 0) ans[i - 1] = sum[i + n - 1] - sum[i + n + k - 1];
//            else ans[i - 1] = sum[i + k] - sum[i];
//        }
//        return ans;
//    }
//}
