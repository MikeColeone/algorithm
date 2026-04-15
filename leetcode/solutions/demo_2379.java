//public class demo_2379 {
//}
//
//class Solution {
//    public int minimumRecolors(String blocks, int k) {
//        int n = blocks.length(), a = 0;
//        int ans = 0;
//        int t = 0;//创建临时变量储存需改次数
//        //k一定大于等于ns
//        //此时窗口大于最大长度
//        while(a<k) {
//            if (blocks.charAt(a)=='W') t++;
//            a++;
//        }
//        ans = t;
//
//        //由w-b 减一
//        //由b-w 加一
//        //只考虑新进的字符 和出去的字符 也就是只考虑变化的部分
//        while(a<n){
//
//            if(blocks.charAt(a)=='W') t++;
//
//            //注意索引的位置 从0开始
//            if(blocks.charAt(a-k)=='W') t--;
//            ans = Math.min(ans,t);
//            a++;
//        }
//
//        return ans;
//
//    }
//}