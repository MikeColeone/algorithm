class Solution {
    public int binaryGap(int n) {
        int last = -1;
        int max = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                if (last != -1) {
                    max = Math.max(max, i - last);
                }
                last = i;
            }
        }
        return max;
        
    }
}