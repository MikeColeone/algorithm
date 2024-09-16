//package com.method;
//
//public class demo_1652 {
//
//}

//暴力求解
//class Solution {
//    public int[] decrypt(int[] code, int k) {
//        if (k==0) {
//            for (int i = 0;i< code.length;i++) code[i] = 0;
//            return code;
//        }
//        int[] ans = new int[code.length];
//        if(k>0)
//            for (int i = 0;i<code.length;i++){
//                for (int j = 1;j<=k;j++){
//                    ans[i]+=code[(i+j)%code.length];
//                }
//            }
//        else{
//            for (int i = code.length-1;i>=0;i--){
//                for (int j = -1;j>=k;j--){
//                    if(i+j<0)
//                    ans[i]+=code[(i+j)%code.length+code.length];
//                    else{
//                        ans[i]+=code[(i+j)%code.length];
//                    }
//                }
//            }
//        }
//        return ans;
//    }
//}


//前缀和
//class Solution {
//    public int[] decrypt(int[] code, int k) {
//        int n = code.length;
//        int[] ans = new int[n];
//        if (k == 0) return ans;
//        int[] sum = new int[n * 2 + 10];
//        for (int i = 1; i <= 2 * n; i++) sum[i] += sum[i - 1] + code[(i - 1) % n];
//        for (int i = 1; i <= n; i++) {
//            if (k < 0) ans[i - 1] = sum[i + n - 1] - sum[i + n + k - 1];
//            else ans[i - 1] = sum[i + k] - sum[i];
//        }
//        return ans;
//    }
//}

import java.lang.reflect.Array;
import java.util.Arrays;

//滑动窗口
class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k==0) {Arrays.fill(code,0); return code;}
        if(k<0) ReverseArray.reverse(code);
        int sum = 0;
        int[] temp = new int[code.length];

            for (int i = 0; i < Math.abs(k); i++) {
                sum += code[i];
            }
            for (int i = 1; i <= code.length; i++) {
                sum += code[(i + Math.abs(k) - 1) % code.length] - code[i - 1];
                temp[i-1] = sum;
            }

        return k<0?ReverseArray.reverse(temp):temp;
    }
}

class ReverseArray {
    public static int[] reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // 交换元素
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // 移动指针
            left++;
            right--;
        }
        return array;
    }
}

//class Solution {
//    public int[] decrypt(int[] code, int k) {
//        int n = code.length;
//        int[] result = new int[n];
//
//        // If k == 0, return an array of zeros
//        if (k == 0) {
//            return result;
//        }
//
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            // For positive k, sum the next k elements
//            if (k > 0) {
//                for (int j = 1; j <= k; j++) {
//                    sum += code[(i + j) % n]; // Wrap around the array
//                }
//            }
//            // For negative k, sum the previous k elements
//            else {
//                for (int j = 1; j <= -k; j++) {
//                    sum += code[(i - j + n) % n]; // Wrap around the array
//                }
//            }
//            result[i] = sum;
//        }
//
//        return result;
//    }
//}
