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


import java.util.*;

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

//
//public class Main {
//    public static int solution(int m, String s) {
//        int count = 0; // 记录成功匹配 "UCC" 的次数
//        int n = s.length();
//        int i = 0;
//
//        // 处理字符串长度小于 3 的情况
//        if (n < 3) {
//
//            for (int j = 0; j < n; j++) {
//                if (calculateEditDistance(s.substring(j, j + 1)) <= m) {
//                    count++;
//                    m--;
//                }
//            }
//            System.out.println(count);
//            return count;
//        }
//        // 窗口滑动遍历字符串
//        while (i <= n - 3) { // 确保窗口长度至少为 3
//            int editDistance = calculateEditDistance(s.substring(i, i + 3));
//            if (editDistance <= m) {
//                count++; // 匹配成功
//                m -= editDistance; // 更新剩余编辑距离
//                i += 3; // 向后移动 3 个位置，避免重复匹配
//            } else {
//                i++; // 向后移动 1 个位置
//            }
//        }
//
//        return count;
//    }
//
//    private static int calculateEditDistance(String source) {
//        String target = "UCC";
//        int distance = 0;
//
//        // 逐字符比较，计算编辑距离
//        for (int i = 0; i < source.length(); i++) {
//            if (source.charAt(i) != target.charAt(i)) {
//                distance++;
//            }
//        }
//        return distance;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(solution(3, "UCUUCCCCC") == 3); // 测试用例 1
//        System.out.println(solution(6, "U") == 2); // 测试用例 2
//        System.out.println(solution(2, "UCCUUU") == 2); // 测试用例 3
//    }
//}
import java.util.Arrays;

import java.util.Arrays;

import java.util.Arrays;

//public class Main {
//    public static int[] solution(int n) {
//        List<Integer> list = new ArrayList<>(); // 使用ArrayList来存储动态结果
//        for (int i = 1; i <= n; i++) { // 外层循环从1到n
//            for (int j = n; j >= i; j--) { // 内层循环从n到i逆序
//                list.add(j); // 将当前数字添加到列表
//            }
//        }
//        // 将List转换为int数组
//        int[] result = new int[list.size()];
//        for (int k = 0; k < list.size(); k++) {
//            result[k] = list.get(k);
//        }
//        return result; // 返回最终结果
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Arrays.equals(solution(3), new int[]{3, 2, 1, 3, 2, 3}));
//        System.out.println(Arrays.equals(solution(4), new int[]{4, 3, 2, 1, 4, 3, 2, 4, 3, 4}));
//        System.out.println(Arrays.equals(solution(5), new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5}));
//    }
//}



//public class Main {
//    public static int solution(int x, int y) {
//        int count = 0;
//        for (int d = 1; d <= 9; d++) {
//            for(long num = d;num <= y; num = num * 10 + d) {
//                if (num >= x && num <= y) {
//                    count++;  // 如果在区间内，计数
//                }
//
//            }
//        }
//
//        return count;
//    }
//    public static void main(String[] args) {
//        // Add your test cases here
//
//        System.out.println(solution(1, 10) == 9);
//        System.out.println(solution(2, 22) == 10);
//    }
//}


import java.util.Arrays;

//public class Main {
//    public static int solution(int[] A) {
//        // 1. 将分数按降序排序（高到低）
//        A = Arrays.stream(A)
//                .boxed()
//                .sorted((a, b) -> b - a) // 降序
//                .mapToInt(Integer::intValue)
//                .toArray();
//
//        int n = A.length; // 学生人数
//        int liarCount = 0; // 说谎学生的数量
//        int count = 0; // 当前分数 ≤ A[i] 的学生人数
//
//        // 2. 遍历分数数组
//        for (int i = 0; i < n; i++) {
//            count++; // 每遍历一个学生，当前分数 ≤ A[i] 的人数加1
//
//            // 比较当前分数 ≤ A[i] 的人数 和 比他分数高的学生人数
//            if (count > i + 1) { // i+1 表示有多少人比他分数高
//                liarCount++; // 满足条件，计为说谎学生
//            }
//        }
//
//        return liarCount;
//    }
//
//    public static void main(String[] args) {
//        // 测试用例
//        System.out.println(solution(new int[]{100, 100, 100}) == 3); // 输出 3
//        System.out.println(solution(new int[]{2, 1, 3}) == 2);       // 输出 2
//        System.out.println(solution(new int[]{30, 1, 30, 30}) == 3); // 输出 3
//        System.out.println(solution(new int[]{19, 27, 73, 55, 88}) == 3); // 输出 3
//        System.out.println(solution(new int[]{19, 27, 73, 55, 88, 88, 2, 17, 22}) == 5); // 输出 5
//    }
//}


//public class Main {
//    public static String solution(String binary1, String binary2) {
//        // Please write your code here
//        int decimal1 = Integer.parseInt(binary1, 2);  // 将第一个二进制字符串转十进制
//        int decimal2 = Integer.parseInt(binary2, 2);  // 将第二个二进制字符串转十进制
//        int result = decimal1 + decimal2;  // 十进制相加
//        return String.valueOf(result);  // 结果转字符串返回
//    }
//
//    public static void main(String[] args) {
//        // You can add more test cases here
//        System.out.println(solution("101", "110").equals("11"));
//        System.out.println(solution("111111", "10100").equals("83"));
//        System.out.println(solution("111010101001001011", "100010101001").equals("242420"));
//        System.out.println(solution("111010101001011", "10010101001").equals("31220"));
//    }
//}

//import java.math.BigInteger;
//
//public class Main {
//    public static String solution(String a, String b) {
//        StringBuilder result = new StringBuilder();
//        int carry = 0; // 进位
//        int i = a.length() - 1, j = b.length() - 1;
//
//        // 从右往左逐位相加
//        while (i >= 0 || j >= 0 || carry > 0) {
//            int bit1 = (i >= 0) ? a.charAt(i--) - '0' : 0;
//            int bit2 = (j >= 0) ? b.charAt(j--) - '0' : 0;
//
//            int sum = bit1 + bit2 + carry; // 当前位相加
//            result.append(sum % 2); // 当前位结果
//            carry = sum / 2; // 更新进位
//        }
//
//
//        BigInteger decimalResult = new BigInteger(result.reverse().toString(), 2);
//        return decimalResult.toString(); // 返回十进制字符串
//    }
//
//    public static void main(String[] args) {
//        System.out.println(solution("101", "110").equals("11"));
//        System.out.println(solution("111111", "10100").equals("83"));
//        System.out.println(solution("111010101001001011", "100010101001").equals("242420"));
//        System.out.println(solution("111010101001011", "10010101001").equals("31220"));
//    }
//}


//
//public class Main {
//    public static boolean solution(int[] nums) {
//        boolean increasing = true; // 假设数组是单调递增的
//        boolean decreasing = true; // 假设数组是单调递减的
//
//        // 遍历数组，检查每个相邻元素的关系
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] > nums[i - 1]) {
//                decreasing = false; // 如果当前元素大于前一个元素，则不是单调递减
//            }
//            if (nums[i] < nums[i - 1]) {
//                increasing = false; // 如果当前元素小于前一个元素，则不是单调递增
//            }
//        }
//
//        return increasing || decreasing;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(solution(new int[]{1, 2, 2, 3}) == true);
//        System.out.println(solution(new int[]{6, 5, 4, 4}));
//        System.out.println(solution(new int[]{1, 3, 2, 4, 5}) == false);
//        System.out.println(solution(new int[]{1, 1, 1, 1}) == true);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        System.out.println(solution("0.1", "1.1") == -1);
//        System.out.println(solution("1.0.1", "1") == 1);
//        System.out.println(solution("7.5.2.4", "7.5.3") == -1);
//        System.out.println(solution("1.0", "1.0.0") == 0);
//    }
//
//    public static int solution(String version1, String version2) {
//        // 将版本号字符串分割成修订号数组
//        String[] v1 = version1.split("\\.");
//        String[] v2 = version2.split("\\.");
//
//        // 找到两个版本号数组的最大长度
//        int maxLength = Math.max(v1.length, v2.length);
//
//        // 从左到右依次比较每个修订号
//        for (int i = 0; i < maxLength; i++) {
//            // 获取当前修订号的整数值，超出数组长度的部分默认补0
//            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
//            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
//
//            // 比较当前修订号
//            if (num1 > num2) return 1;
//            if (num1 < num2) return -1;
//        }
//
//        // 所有修订号都相等，返回0
//        return 0;
//    }
//}
//
//
//public class Main {
//    public static String solution(int n, int k, String s) {
//        char[] chars = s.toCharArray(); // 将字符串转换成字符数组，方便操作
//        int i = 0; // 遍历字符串的指针
//        int swaps = 0; // 记录已使用的操作次数
//
//        while (i < n && k > 0) {
//            if (chars[i] == '0') {
//                // 找到前面能交换的最远位置
//                int j = i;
//                while (j > 0 && chars[j - 1] == '1' && k > 0) {
//                    // 将 '0' 与前面的 '1' 交换
//                    char temp = chars[j];
//                    chars[j] = chars[j - 1];
//                    chars[j - 1] = temp;
//
//                    j--; // 继续向前移动
//                    k--; // 消耗一次操作次数
//                }
//            }
//            i++; // 继续向后遍历
//        }
//        return new String(chars); // 将字符数组转回字符串
//    }
//
//    public static void main(String[] args) {
//        System.out.println(solution(5, 2, "01010").equals("00101")); // true
//        System.out.println(solution(7, 3, "1101001").equals("0110101")); // true
//        System.out.println(solution(4, 1, "1001").equals("0101")); // true
//    }
//}


//public class Main {
//    public static int solution(int n, int k, int[] data) {
//        int cost = data[0]; // 总花费
//        int food = 0; // 背包当前食物数量
//
//        for (int i = 0; i < n; i++) {
//            int minP = data[i];
//
//            for (int j = i; j < Math.min(i + food, n); j++) {
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
//         System.out.println(solution(5, 2, new int[] { 1, 2, 3, 3, 2 }) == 9);
////        System.out.println(solution(6, 3, new int[] { 4, 1, 5, 2, 1, 3 }));
//    }
//}

//public class Main {
//    public static int solution(int[] nums) {
//        // write code here
//        int ans = -1;
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            max = Math.max(max, nums[i]);
//        }
//        for (int i = 0; i < max; i++) {
//            int count = 0;
//            ans = i;
//            for (int j = 0; j < nums.length; j++) {
//                if(nums[j]>=ans){
//                    count++;
//                }
//            }
//            if(count==ans) return ans;
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(solution(new int[]{3, 8}) == 2);
//        System.out.println(solution(new int[]{0, 3, 4, 0, 4}) == 3);
//        System.out.println(solution(new int[]{4, 7, 8, 1, 0}) == 3);
//        System.out.println(solution(new int[]{5, 6, 0, 1, 2}) == -1);
//        System.out.println(solution(new int[]{7, 3, 4, 5, 6}) == 4);
//    }
//}


import java.util.*;
//public class Main {
//    public static int[] solution(int n, int max, int[] array) {
//        Map<Integer, Integer> countMap = new HashMap<>(); // 统计每个牌面的数量
//        List<Integer> threeCandidates = new ArrayList<>(); // 存储三张相同牌面的候选
//        List<Integer> twoCandidates = new ArrayList<>();   // 存储两张相同牌面的候选
//
//        // 统计每个牌面的出现次数
//        for (int num : array) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//
//        // 将符合条件的牌面放入候选列表
//        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
//            int card = entry.getKey();
//            int freq = entry.getValue();
//            if (freq >= 3) {
//                threeCandidates.add(card); // 至少有3张，加入三张候选
//            }
//            if (freq >= 2) {
//                twoCandidates.add(card);   // 至少有2张，加入两张候选
//            }
//        }
//
//        // 自定义比较规则：1 (A) 最大，K(13) > Q(12) > J(11) > 10 > ... > 2
//        Comparator<Integer> comparator = (a, b) -> {
//            if (a == 1 && b != 1) return -1; // A最大
//            if (a != 1 && b == 1) return 1;
//            return b - a; // 其他牌面按降序排序
//        };
//
//
//        threeCandidates.sort(comparator);
//        System.out.println(Arrays.toString(threeCandidates.toArray()));
//        twoCandidates.sort(comparator);
//
//        int bestA = 0, bestB = 0; // 结果的三张和两张的牌面值
//
//        int sum = 0;
//// 遍历所有三张候选组合，寻找符合要求的最大葫芦
//        for (int a : threeCandidates) {
//            for (int b : twoCandidates) {
//                // 两张牌 b 可以从三张牌 a 中取，但要保证 a ≠ b
//                if (a == b) continue;
//
//                // 计算牌面和，判断是否满足最大和的限制
//                int sum = 3 * a + 2 * b;
//                if (sum <= max) {
//                    // 按照 a > b 的规则，寻找最优的组合
//                    if (bestA == 0 || a > bestA || (a == bestA && b > bestB)) {
//                        bestA = a;
//                        bestB = b;
//                    }
//                }
//            }
//
//            // 处理两张相同牌 b 可以从三张 a 中取的情况
//            int b = a; // 直接从 a 中选取两张相同牌
//            int sum = 3 * a + 2 * b;
//            if (sum <= max) {
//                if (bestA == 0 || a > bestA || (a == bestA && b > bestB)) {
//                    bestA = a;
//                    bestB = b;
//                }
//            }
//        }
//
//        // 如果未找到符合条件的葫芦，返回 [0, 0]
//        if (bestA == 0 && bestB == 0) {
//            return new int[]{0, 0};
//        }
//        return new int[]{bestA, bestB};
//    }
//
//    public static void main(String[] args) {
//        // Add your test cases here
//
//        System.out.println(java.util.Arrays.equals(solution(9, 34, new int[]{6, 6, 6, 8, 8, 8, 5, 5, 1}), new int[]{8, 5}));
//        System.out.println(java.util.Arrays.equals(solution(31,42,new int[]{3,3,11,12,12,2,13,5,13,1,13,8,8,1,8,13,12,9,2,11,3,5,8,11,1,11,1,5,4,2,5}),new int[]{1,13}));
//        System.out.println(java.util.Arrays.equals(solution(9, 37, new int[]{9, 9, 9, 9, 6, 6, 6, 6, 13}), new int[]{6, 9}));
//        System.out.println(java.util.Arrays.equals(solution(9, 40, new int[]{1, 11, 13, 12, 7, 8, 11, 5, 6}), new int[]{0, 0}));
//    }
//}


    //第一次遇到不是必须选的
//public class Main {
//    public static int solution(int n, int H, int A, int[] h, int[] a) {
//        int flag = 0;//默认是跳过
//        int ht = 0;
//        int at = 0;
//        int count = (h[0] < H && a[0] < A) ? 1 : 0;
//        if(count==1) {
//            flag = 1;
//            ht=h[0];
//            at = a[0];
//        }
//        for (int i = 1; i < n; i++) {
//            if (h[i] <= H && a[i] <= A && h[i] >= ht && a[i] >= at&&flag==1) {
//                count++;
//                ht=h[i];
//                at = a[i];
//            }
//            else if(flag==0) {
//                if(h[i] <= H && a[i] <= A){
//                    count++;
//                    at=a[i];
//                    ht = h[i];
//                    flag=1;
//                }
//            }
//        }
//        System.out.println(count);
//        return count;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(solution(3, 4, 5, new int[] { 1, 2, 3 }, new int[] { 3, 2, 1 }) == 1);
//        System.out.println(solution(5, 10, 10, new int[] { 6, 9, 12, 4, 7 }, new int[] { 8, 9, 10, 2, 5 }) == 2);
//        System.out.println(solution(4, 20, 25, new int[] { 10, 15, 18, 22 }, new int[] { 12, 18, 20, 26 }) == 3);
//    }
//}


//public class Main {
//    public static int solution(int n, int H, int A, int[] h, int[] a) {
//        int[] dp = new int[n]; // dp[i] 表示以第 i 个怪物为结尾时，最多击败的怪物数
//        int maxCount = 0; // 最终结果
//
//        for (int i = 0; i < n; i++) {
//            if (h[i] < H && a[i] < A) { // 只有当前怪物满足条件才可能击败
//                dp[i] = 1; // 初始化为单独击败当前怪物 重置！！！！
//                for (int j = 0; j < i; j++) {
//                    // 如果怪物 j 可以击败，且属性递增 是j到i的序列
//                    if (h[j] < h[i] && a[j] < a[i]) {
//                        dp[i] = Math.max(dp[i], dp[j] + 1);
//                    }
//                }
//                maxCount = Math.max(maxCount, dp[i]); // 更新最大值
//            }
//        }
//
//        return maxCount;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(solution(3, 4, 5, new int[] { 1, 2, 3 }, new int[] { 3, 2, 1 }) == 1);
//        System.out.println(solution(5, 10, 10, new int[] { 6, 9, 12, 4, 7 }, new int[] { 8, 9, 10, 2, 5 }) == 2);
//        System.out.println(solution(4, 20, 25, new int[] { 10, 15, 18, 22 }, new int[] { 12, 18, 20, 26 }) == 3);
//    }
//}

//区分最长递归序列 该题等价与取出最长递增子序列


import java.util.*;

public class Main {
    public static String solution(int n, String template, String[] titles) {
        // 将模板转换为正则表达式
        String regex = template.replaceAll("\\{.*?\\}", ".*");

        // 构建结果字符串
        StringBuilder result = new StringBuilder();
        for (String title : titles) {
            if (title.matches(regex)) {
                result.append("True");
            } else {
                result.append("False");
            }
            result.append(",");
        }

        // 删除最后一个逗号
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

    public static void main(String[] args) {
        // 你可以添加更多测试用例
        String[] testTitles1 = {"adcdcefdfeffe", "adcdcefdfeff", "dcdcefdfeffe", "adcdcfe"};
        String[] testTitles2 = {"CLSomGhcQNvFuzENTAMLCqxBdj", "CLSomNvFuXTASzENTAMLCqxBdj", "CLSomFuXTASzExBdj", "CLSoQNvFuMLCqxBdj", "SovFuXTASzENTAMLCq", "mGhcQNvFuXTASzENTAMLCqx"};
        String[] testTitles3 = {"abcdefg", "abefg", "efg"};

        System.out.println(solution(4, "ad{xyz}cdc{y}f{x}e", testTitles1).equals("True,False,False,True"));
        System.out.println(solution(6, "{xxx}h{cQ}N{vF}u{XTA}S{NTA}MLCq{yyy}", testTitles2).equals("False,False,False,False,False,True"));
        System.out.println(solution(3, "a{bdc}efg", testTitles3).equals("True,True,False"));
    }
}