package com.method;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class demo_3137 {
    public static void main(String[] args) {
        //初始化变量
        int k = 0;
        String str = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            k = sc.nextInt();
            str = sc.next();
            Solution s = new Solution();
            int ans = s.minimumOperationsToMakeKPeriodic(str,k);
            System.out.println(ans);
        }
    }
}

//mySolution
class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        int n = word.length() / k;
        Map<String, Integer> map = new HashMap<>();

        // 统计所有长度为 k 的子字符串出现的次数
        for (int i = 0; i <= word.length() - k; i += k) {
            String sub = word.substring(i, i + k);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
        }

        // 找到出现次数最多的子字符串
        int maxCount = 0;
        for (int count : map.values()) {
            maxCount = Math.max(maxCount, count);
        }

        // 返回将其余子字符串变为最多子字符串所需的最少操作数
        return n - maxCount;
    }
}

class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        int n = word.length(), res = Integer.MAX_VALUE;
        HashMap<String, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i += k) {
            String part = word.substring(i, i + k);
            res = Math.min(res, n / k - count.merge(part, 1, Integer::sum));

        }
        return res;
    }
}