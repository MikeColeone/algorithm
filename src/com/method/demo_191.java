package com.method;

public class demo_191 {
}
class Solution {
    public int hammingWeight(int n) {
        int ans = 0;
        while(n>0){
            if(n%2==1){
                ans++;
            }
            n/=2;
        }
        return ans;
    }
}