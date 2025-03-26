//package com.method;
//
//import java.util.Deque;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Map;
//
//public class demo_20 {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        String s = "([)]";
//        System.out.println(solution.isValid(s));
//    }
//}
//
//class Solution {
//    public boolean isValid(String s) {
//        int n = s.length();
//        // 如果字符串长度为奇数，括号一定无效
//        if (n % 2 == 1) {
//            return false;
//        }
//        // 存储括号对的映射
//        Map<Character, Character> pairs = new HashMap<>();
//        pairs.put('(', ')');
//        pairs.put('{', '}');
//        pairs.put('[', ']');
//
//        // 创建一个双端队列作为栈
//        Deque<Character> stack = new LinkedList<>();
//
//        for (int i = 0; i < n; i++) {
//            char c = s.charAt(i);
//            // 如果是左括号，入栈
//            if (pairs.containsKey(c)) {
//                stack.push(c);
//            } else {
//                // 如果是右括号，检查栈是否为空
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                // 弹出栈顶元素
//                char top = stack.pop();
//                // 检查栈顶左括号和当前右括号是否匹配
//                if (pairs.get(top) != c) {
//                    return false;
//                }
//            }
//        }
//        // 遍历结束后，栈为空则括号有效
//        return stack.isEmpty();
//    }
//}