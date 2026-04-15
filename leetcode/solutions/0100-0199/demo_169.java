package com.method;

import java.util.HashMap;
import java.util.*;
public class demo_169 {

}



//class Solution {
//    public int majorityElement(int[] nums) {
//        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for (int i =0;i<nums.length;i++){
//            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//        }
//
//        for (int i = 0;i<nums.length;i++){
//            if(map.get(nums[i])>(nums.length/2)){
//                return nums[i];
//            }
//        }
//
//        return -1;
//    }
//}