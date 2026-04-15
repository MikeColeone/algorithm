////最大子数组和
//public class demo_53 {
//}
//
//
//class Solution{
//
//    public int maxSubArray(int[] nums) {
//        int max = nums[0];
//        int pre = 0;
//        for(int num:nums){
//            pre=Math.max(num,pre+num);
//            max = Math.max(pre,max);
//
//        }
//        return max;
//    }
//}