//import java.util.Arrays;
//import java.util.Scanner;
//
//public class demo_455 {
//
//}
//
//
//class Solution {
//    public int findContentChildren(int[] g, int[] s) {
//        Arrays.sort(g);
//        Arrays.sort(s);
//        int n = s.length;
//        int m = g.length;
//
//        int i = 0;
//        int j = 0;
//        int ans = 0;
//        while (i<m&&j<n){
//            if(g[i]<=s[j]){
//                ans++;
//                i++;
//            }
//            j++;
//
//        }
//        return ans;
//    }
//}