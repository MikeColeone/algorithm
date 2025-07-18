package com.method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo_438 {
}


class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n1 = s.length();
        int n2 = p.length();
        if (n1 < n2) return new ArrayList<>();  // 返回空列表而不是null

        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> map1 = new HashMap<>(); // 当前窗口字符频率
        Map<Character, Integer> map2 = new HashMap<>(); // p字符串的字符频率

        // 统计p中字符频率
        for (int i = 0; i < n2; i++) {
            map2.put(p.charAt(i), map2.getOrDefault(p.charAt(i), 0) + 1);
        }

        // 初始化窗口 [0, n2)
        for (int i = 0; i < n2; i++) {
            char c = s.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        if (map1.equals(map2)) ans.add(0); // 检查初始窗口

        // 开始滑动窗口
        for (int i = n2; i < n1; i++) {
            // 移出窗口最左边的字符
            char outChar = s.charAt(i - n2);
            map1.put(outChar, map1.get(outChar) - 1);
            if (map1.get(outChar) == 0) {
                map1.remove(outChar);
            }

            // 加入新字符
            char inChar = s.charAt(i);
            map1.put(inChar, map1.getOrDefault(inChar, 0) + 1);

            // 比较两个map
            if (map1.equals(map2)) {
                ans.add(i - n2 + 1); // 当前窗口起点
            }
        }

        return ans;
    }
}
