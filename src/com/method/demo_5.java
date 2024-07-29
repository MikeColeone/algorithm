package com.method;

public class demo_5 {

    public static void main(String[] args) {
        System.out.printf("==========");
    }

}

////暴力求解 5%
//class Solution {
//    //判断是否回文
//    public boolean judge(String s){
//        int i = 0;
//        int j = s.length()-1;
//        int flag = 0;
//        while (i<j){
//            if(s.charAt(i)!=s.charAt(j)) {
////                System.out.println(i);
////                System.out.println(j);
//                return false;
//            }
//            else {
//                i++;
//                j--;
//            }
//        }
//
//
//        return true;
//    }
//    //寻找字串
//    public String longestPalindrome(String s) {
//        if(s.length()==1) return s;
//        String ans = null;
//        int max = -1;
//        int j = 0;
//        while (j <= s.length()) {
//            int i=0;
//            for (i = 0; i < s.length() - 1; i++) {
//                if (i + j + 1 <= s.length()) {
////                    System.out.println(i+" "+j );
//                    //System.out.println(s.substring(i,i+j+1));
//                    if (judge(s.substring(i, i + j + 1))) {
//                        //System.out.println(i+" "+j );
//                        ans = s.substring(i, i + j + 1);
//                        if (i + j >= max)
//                            max = j + 1;
//                        break;
//                    }
//                }
//            }
//            j++;
//        }
//        return ans;
//    }
//}



//动态规划 10%
//class Solution {
//
//    //final static int MAX = 100;
//    //创建dp数组
//    //dp[i][j]表示由i到j是回文字串 dp[i][j]由dp[i+1][j-1]决定
//    public String longestPalindrome(String s) {
//        int begin = 0;
//        int end = 0;
//        boolean[][] dp = new boolean[s.length()][s.length()];
//        //当长度是1直接返回
//        if(s.length()==1) return s;
//        //初始化数组
//        for (int i = 0;i<s.length();i++){
//            dp[i][i] = true;
//        }
//
//        //卡出左边界 右边界
//        int max = -1;
//        for (int l = 1;l<=s.length();l++){
//            for (int i = 0;i<s.length();i++){
//                int j = l+i-1;
//                if(j>=s.length()) break; //判定越界
//                if(s.charAt(i)!=s.charAt(j)){
//                    dp[i][j]=false;
//                }else {
//                    if (j - i < 3) {
//                        dp[i][j] = true;
//                    } else {
//                        dp[i][j] = dp[i + 1][j - 1];
//                    }
//                }
//
//                if (dp[i][j]) {
//                   // System.out.println("===========");
//                    if (j - i + 1 > max) {
//                        max = j - i + 1;
//                        begin = i;
//                        end = j + 1;
//                    }
//                }
//            }
//        }
//        return s.substring(begin,end);
//
//    }
//}
