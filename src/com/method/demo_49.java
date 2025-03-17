package com.method;

import java.util.*;

public class demo_49 {
}
/*字母异位词分组*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //排序之后的字符串作为键
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] stringToChar = s.toCharArray();
            Arrays.sort(stringToChar);
            String key = new String(stringToChar);
//            List<String> list = map.get(key);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(s);
            map.put(key, list);
        }

        System.out.println(map.values());
        return new ArrayList<>(map.values());
    }
}