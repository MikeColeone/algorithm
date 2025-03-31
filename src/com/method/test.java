package com.method;

import java.util.Scanner;

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


