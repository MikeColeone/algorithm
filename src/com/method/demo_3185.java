package com.method;

public class demo_3185 {
}

//
//class Solution {
//    public long countCompleteDayPairs(int[] hours) {
//        int[] cnt = new int[25]; //直接存储和当前数位相加是倍数的出现数量
//        int day = 24;
//        int t = 0;
//        int s = 0;
//        long ans = 0;
//        for (int hour : hours) {
//            t = 24 - hour % 24;
//            if(hour%24==0) ans+=cnt[0];
//            if (cnt[t] != 0) {
//                ans += cnt[t];
//            }
//            cnt[hour % 24]++;
//        }
//        return ans;
//    }
//}



//通过取模操作实现减少判断0和本身 同时实现可以少申请一点空间

class Solution {
    public long countCompleteDayPairs(int[] hours) {
        int[] cnt = new int[24]; //直接存储和当前数位相加是倍数的出现数量
        long ans = 0;
        for (int hour : hours) {
            ans += cnt[(24 - hour % 24)%24];
            cnt[hour % 24]++;
        }
        return ans;
    }
}