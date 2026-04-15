//public class demo_14 {
//}
//
////class Solution {
////    public String longestCommonPrefix(String[] strs) {
////        if (strs == null) {
////            return "";
////        }
////        String prefix = strs[0];
////        int n = strs.length;
////        for (int i = 1; i < n; i++) {
////            //在循环中不断找到最长公共字串
////            prefix = longestCommonPrefix(prefix, strs[i]);
////            if (prefix.isEmpty()) {
////                break;
////            }
////        }
////        return prefix;
////    }
////
////    public String longestCommonPrefix(String str1, String str2) {
////        //得到两字串最短的长度
////        int length = Math.min(str1.length(), str2.length());
////        //初始化索引位置
////        int index = 0;
////        //遍历字串找到两字串的最短字串
////        while (index < length && str1.charAt(index) == str2.charAt(index)) {
////            index++;
////        }
////        return str1.substring(0, index);
////    }
////}
//
