package com.method;

public class demo_1423 {
}
//class Solution {
//    public int maxScore(int[] cardPoints, int k) {
//        int l = 0;
//        int r = cardPoints.length-1;
//        int ans = 0;
//        int t = 0;
//        while(l<=r){
//
//            if(cardPoints[l]==cardPoints[r]){
//                ans+=cardPoints[l];
//                l++;
//                r--;
//                System.out.println(cardPoints[l]);
//            }
//            else if(cardPoints[l]>cardPoints[r]){
//                ans+=cardPoints[l];
//
//                l++;
//                System.out.println(cardPoints[l]);
//            }
//            else {
//                ans+=cardPoints[r];
//
//                r--;
//                System.out.println(cardPoints[r]);
//            }
////            System.out.println(ans);
//            t++;
//            if(t==k) break;
//        }
//        return ans;
//
//    }
//}
//逆向思维 剩下的一定为连续的 只要满足剩下的最小就可以
//class Solution{
//    public int maxScore(int[] cardPoints, int k){
//
//        int n = cardPoints.length;
//        int m = n - k;
//        int ans = 0;
//        int totals = 0;
//        //维护一个长度为k的窗口
//        for (int i = 0;i<m;i++){
//            ans+=cardPoints[i];
//        }
//        totals = ans;
//        int min = ans;
//        for (int i = m;i<n;i++){
//            totals+=cardPoints[i];
//            ans+=cardPoints[i]-cardPoints[i-m];
//            min = Math.min(ans,min);
//        }
//        return totals-min;
//    }
//}

//正向思维