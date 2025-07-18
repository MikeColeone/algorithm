//package com.method;
//
//import java.util.*;
//public class doubao_2 {
//    public static int solution(int n, int k, int[] data) {
//        int cost = 0; // 总花费
//        int food = 0; // 背包当前食物数量
//
//        for (int i = 0; i < n; i++) {
//            // 每天先消耗 1 单位食物
//            if (food > 0) {
//                food--;
//            } else {
//                // 背包空了，必须购买当天的食物
//                cost += data[i];
//            }
//
//            // 找到未来 k 天（含今天）的最小单价
//            int minP = data[i];
//            for (int j = i; j < Math.min(i + k + 1, n); j++) {
//                minP = Math.min(minP, data[j]);
//            }
//
//            // 计算背包剩余空间
//            int remainingSpace = k - food;
//            if (remainingSpace > 0 && data[i] == minP) {
//                // 尽可能购买食物，但不要超过剩余天数
//                int maxCanBuy = n - 1 - i; // 剩余需要的天数
//                int buy = Math.min(remainingSpace, maxCanBuy);
//                cost += buy * minP;
//                food += buy;
//            }
//        }
//        return cost;
//    }
//
//    public static void main(String[] args) {
//        // Add your test cases here
//
//        System.out.println(solution(5, 2, new int[]{1, 2, 3, 3, 2}));
//        System.out.println(solution(6, 3, new int[]{4, 1, 5, 2,1,3}));
////        System.out.println(solution(5, 2, new int[]{1, 2, 3, 3, 2}) == 9);
//    }
//}
