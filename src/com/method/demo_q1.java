//package com.method;
//
//public class demo_q1 {
//}
//class Solution {
//    public int finalPositionOfSnake(int n, List<String> commands) {
//        int m = 1;
//        //获取到宽度
//        for(String string:commands) {
//            if(string.equals("RIGHT")){
//                m++;
//            }
//        }
//        int ans = 0;
//        for(String s:commands){
//            if(s.equals("DOWN")) ans+=m;
//            else if(s.equals("UP")) ans-=m;
//            else if(s.equals("LEFT")) ans--;
//            else if(s.equals("RIGHT")) ans++；
//        }
//        return ans;
//    }
//}