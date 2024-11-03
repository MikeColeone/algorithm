package com.method;

import java.util.EnumSet;

public class demo_121 {
}

//买股票的最佳时机
class Solution {
    public int maxProfit(int[] prices) {
        int max = -1;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            //时刻更新暂时的最小值
            min = min>price?price :min;
//            min = Math.min(min, price);

//            System.out.println(min);
            max = price-min>max?(price-max):max;
            System.out.println(max);
        }
        return max;
    }
}