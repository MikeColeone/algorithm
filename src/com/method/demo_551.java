package com.method;

public class demo_551 {
}

////无脑揭发
//class Solution {
//    public boolean checkRecord(String s) {
//        //记录缺勤
//        int a = 0;
//        int l = 0;
//
//      for (int i = 0;i<s.length();i++){
//          if(s.charAt(i)=='A') {
//              a++;
//              System.out.println(a);
//
//              if(a>=2) return false;
//          }
//          l=0;
//          if(s.charAt(i)=='L'){
//             for(int j = i+1;j<s.length();j++){
//                 if(s.charAt(i)==s.charAt(j)) l++;
//                 else break;
//                 if(l==2) return false;
//             }
//
//          }
//      }
//      return true;
//    }
//}

//class Solution {
//    public boolean checkRecord(String s) {
//        int n = 0,t=0;
//        for (int i = 0;i<s.length();i++){
//            if(s.charAt(i)=='A'){
//                n++;
//                if(n>=2) return false;
//            }
//            if(s.charAt(i)=='L'){
//                t++;
//                if(t==3) return false;
//            }
//            else t = 0;
//        }
//        return true;
//    }
//}