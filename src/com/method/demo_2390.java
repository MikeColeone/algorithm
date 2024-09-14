//package com.method;
//
//public class demo_2390 {
//}
//
//class Solution {
//    public String removeStars(String s) {
//        //只维护最后一个字符即可
//        StringBuilder ans = new StringBuilder();
//        for (int i = 0; i < s.length();i++){
//            if(s.charAt(i)!='*') ans.append(s.charAt(i));
//            else ans.setLength(ans.length()-1);
//        }
//        return ans.toString();
//    }
//}