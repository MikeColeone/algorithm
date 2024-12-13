package com.method;//package com.method;
//
//public class Main {
//    public static int solution(int[] numbers) {
//        // 初始化状态：evenCount 表示和为偶数的组合数，oddCount 表示和为奇数的组合数
//        int evenCount = 1; // 初始时，空集合的和为偶数
//        int oddCount =
//        0;
//
//        // 遍历每个数字组
//        for (int group : numbers) {
//            int groupOddCount = 0;
//            int groupEvenCount = 0;
//
//            // 统计当前组中的奇数和偶数的个数
//            while (group > 0) {
//                int digit = group % 10;  // 获取当前数字的最后一位
//                if (digit % 2 == 1) { // 奇数
//                    groupOddCount++;
//                } else { // 偶数
//                    groupEvenCount++;
//                }
//                group /= 10;  // 去掉最后一位
//            }
//
//            // 计算新的状态
//            int newEvenCount = evenCount * groupEvenCount + oddCount * groupOddCount;
//            int newOddCount = evenCount * groupOddCount + oddCount * groupEvenCount;
//
//            // 更新状态
//            evenCount = newEvenCount;
//            oddCount = newOddCount;
//        }
//
//        return evenCount; // 返回和为偶数的组合数
//    }
//
//    public static void main(String[] args) {
//        // 测试用例
//        System.out.println(solution(new int[] { 123, 456, 789 }) == 14);  // 和为偶数的组合数: 14
//        System.out.println(solution(new int[] { 123456789 }) == 4);      // 和为偶数的组合数: 4
//        System.out.println(solution(new int[] { 14329, 7568 }) == 10);    // 和为偶数的组合数: 10
//    }
//}


//public class Main {
//    public static int solution(int n, int k, int[] data) {
//        int cost = data[0]; // 总花费
//        int food = 1; // 背包当前食物数量
//
//        for (int i = 0; i < n; i++) {
//
//            // 找到未来 k 天（含今天）的最小单价
//            int minP = data[i];
//
//            for (int j = i; j < Math.min(i + food + 1, n); j++) {
//                minP = Math.min(minP, data[j]);
//            }
//
//            // 计算背包剩余空间
//            int c = k - food;
//            if (c > 0 && data[i] == minP) {
//                // 尽可能购买食物，但不要超过剩余天数
//                int d = n - 1 - i; // 剩余需要的天数
//                int buy = Math.min(c, d);
//                System.out.println("buy   " + buy);
//                System.out.println("price    " + data[i]);
//                cost += buy * minP;
//                food += buy;
//            }
//            // 每天先消耗 1 单位食物
//            if (food > 0) {
//                food--;
//            } else {
//                // 背包空了，必须购买当天的食物
//                cost += data[i];
//            }
//        }
//        return cost;
//    }
//
//    public static void main(String[] args) {
//        // Add your test cases here
//
//        // System.out.println(solution(5, 2, new int[] { 1, 2, 3, 3, 2 }) == 9);
//        System.out.println(solution(6, 3, new int[] { 4, 1, 5, 2, 1, 3 }));
//    }
//}
//


//split参数是正则表达式
//public class Main {
//    public static int solution(String S, String T) {
//        // write code here
//        //首先判断删除的情况
//        int answer = 0;
//        if(S.length()>T.length()) {
//            answer+=S.length()-T.length();
//            System.out.println("answer"+answer);
//
//            S = S.substring(0,T.length());
//        }
//
//        System.out.println(S);
//        int i  = 0;
//        int j = 0;
//        while (i < S.length() && j < T.length()) {
//            if(S.charAt(i) != T.charAt(j)) {
//                answer++;
//                System.out.println(S.charAt(i)+" "+T.charAt(j));
//            }
//            i++;
//            j++;
//
//        }
//
//        System.out.println(answer);
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(solution("aba", "abb") == 1);
//        System.out.println(solution("abcd", "efg") == 4);
//        System.out.println(solution("xyz", "xy") == 1);
//        System.out.println(solution("hello", "helloworld") == 0);
//        System.out.println(solution("same", "same") == 0);
//    }
//}


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//public class Main {
//    public static int solution(int[] values) {
//        int maxScore = Integer.MIN_VALUE;
//        int maxVal = values[0];
//        for (int j = 1; j < values.length; j++) {
//            int score = maxVal + values[j] - j;
//            maxScore = Math.max(maxScore, score);
//            maxVal = Math.max(maxVal, values[j] + j);
//        }
//
//        return maxScore;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(solution(new int[]{8, 3, 5, 5, 6}) == 11 ? 1 : 0);
//        System.out.println(solution(new int[]{10, 4, 8, 7}) == 16 ? 1 : 0);
//        System.out.println(solution(new int[]{1, 2, 3, 4, 5}) == 8 ? 1 : 0);
//    }
//}


//
//public class Main {
//    public static int solution(int[] array) {
//        // Edit your code here
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < array.length; i++) {
//            if(!map.containsKey(array[i])) {
//                map.put(array[i], 1);
//            }
//            else {
//                map.put(array[i], map.get(array[i]) + 1);
//                if(map.get(array[i]) > array.length/2) {
//                    return array[i];
//                }
//            }
//        }
//
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        // Add your test cases here
//
//        System.out.println(solution(new int[]{1, 3, 8, 2, 3, 1, 3, 3, 3}) == 3);
//    }
//}


public class Main {
    public static int solution(int m, String s) {
        int count = 0; // 记录成功匹配 "UCC" 的次数
        int n = s.length();
        int i = 0;

        // 处理字符串长度小于 3 的情况
        if (n < 3) {

            for (int j = 0; j < n; j++) {
                if (calculateEditDistance(s.substring(j, j + 1)) <= m) {
                    count++;
                    m--;
                }
            }
            System.out.println(count);
            return count;
        }
        // 窗口滑动遍历字符串
        while (i <= n - 3) { // 确保窗口长度至少为 3
            int editDistance = calculateEditDistance(s.substring(i, i + 3));
            if (editDistance <= m) {
                count++; // 匹配成功
                m -= editDistance; // 更新剩余编辑距离
                i += 3; // 向后移动 3 个位置，避免重复匹配
            } else {
                i++; // 向后移动 1 个位置
            }
        }

        return count;
    }

    private static int calculateEditDistance(String source) {
        String target = "UCC";
        int distance = 0;

        // 逐字符比较，计算编辑距离
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) != target.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, "UCUUCCCCC") == 3); // 测试用例 1
        System.out.println(solution(6, "U") == 2); // 测试用例 2
        System.out.println(solution(2, "UCCUUU") == 2); // 测试用例 3
    }
}
