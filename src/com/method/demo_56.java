//package com.method;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//
///*合并区间*/
//public class demo_56 {
//    public static void main(String[] args) {
//
//    }
//}
//class Solution {
//    public int[][] merge(int[][] intervals) {
//        if (intervals.length == 0) {
//            return new int[0][2];
//        }
//        Arrays.sort(intervals, new Comparator<int[]>() {
//            public int compare(int[] interval1, int[] interval2) {
//                return interval1[0] - interval2[0];
//            }
//        });
//        List<int[]> merged = new ArrayList<int[]>();
//        for (int[] interval : intervals) {
//            int L = interval[0], R = interval[1];
//            if (merged.isEmpty() || merged.getLast()[1] < L) {
//                merged.add(new int[]{L, R});
//            } else {
//                merged.getLast()[1] = Math.max(merged.getLast()[1], R);
//            }
//        }
//        return merged.toArray(new int[merged.size()][]);
//    }
//}