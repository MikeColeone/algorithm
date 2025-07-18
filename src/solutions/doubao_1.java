package com.method;

import java.util.HashMap;
import java.util.Map;

public class doubao_1 {

    public static int solution(int[] cards) {
        // Edit your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int card : cards) {
            if (map.containsKey(card)) {
                map.put(card, map.get(card) + 1);
            } else {
                map.put(card, 1);
            }
        }

//        map.entrySet 拿出所有键和值
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }

}


