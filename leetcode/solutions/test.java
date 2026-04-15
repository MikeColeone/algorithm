package com.method;

public class test {

    public static void main(String[] args) {


        int[] arr = new int[]{1,2,3,4,5};
        int ans = findNums(arr);

        System.out.println(ans);
    }

//    找到第2打的数
    public static int findNums(int[] arr){

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
                continue;
            }
            if (j > secondMax) {
                secondMax = j;
                System.out.println(j);

            }
        }
        return secondMax;
    }
}

class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer smax = null;
        Integer tmax = null;

        for (Integer num : nums) {  // 注意：这里使用 Integer 而不是 int
            if (num.equals(max) || num.equals(smax) || num.equals(tmax)) {
                continue; // 跳过重复值
            }

            if (max == null || num > max) {
                tmax = smax;
                smax = max;
                max = num;
            } else if (smax == null || num > smax) {
                tmax = smax;
                smax = num;
            } else if (tmax == null || num > tmax) {
                tmax = num;
            }
        }

        return tmax == null ? max : tmax;
    }
}