//package com.method;
//
//public class demo_1456 {
//}
//class Solution {
//    public int maxVowels(String s, int k) {
//        int ans = 0;
//        int max = 0;
//        for (int i = 0;i<k;i++){
//            ans+=judge(s.charAt(i));
//        }
//        max = ans;
////        System.out.println(ans);
//        for (int i = k;i<s.length();i++){
//            ans+=judge(s.charAt(i))-judge(s.charAt(i-k));
//            max=Math.max(ans,max);
//        }
//
//        return max;
//    }
//
//    public int judge(char ch){
//        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return 1;
//        return 0;
//    }
//}
//
