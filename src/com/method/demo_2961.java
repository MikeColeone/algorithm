package com.method;

import java.util.List;

import static java.lang.Math.pow;

public class demo_2961 {
}

//class Solution {
//    public List<Integer> getGoodIndices(int[][] variables, int target) {
//        List<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < variables.length; i++){
//            boolean jud = target == latex(variables[i]);
//            if(jud)ans.add(i);
//        }
//        return ans;
//    }
//
//    public int latex(int[] arr){
//        int ans= (int) (pow((pow(arr[0],arr[1])%10),arr[2])%arr[3]);
//        System.out.println(ans);
//        return ans;
//    }
//}

class Solution {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < variables.length; i++) {
            int[] v = variables[i];
            if (powMod(powMod(v[0], v[1], 10), v[2], v[3]) == target) {
                ans.add(i);
            }
        }
        return ans;
    }

    public int powMod(int x, int y, int mod) {
        int res = 1;
        while (y != 0) {
            if ((y & 1) != 0) {
                res = res * x % mod;
            }
            x = x * x % mod;
            y >>= 1;
        }
        return res;
    }
}
