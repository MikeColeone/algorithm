package com.method;

public class Main {
    public static int solution(int[] numbers) {
        // 初始化状态：evenCount 表示和为偶数的组合数，oddCount 表示和为奇数的组合数
        int evenCount = 1; // 初始时，空集合的和为偶数
        int oddCount = 0;

        // 遍历每个数字组
        for (int group : numbers) {
            int groupOddCount = 0;
            int groupEvenCount = 0;

            // 统计当前组中的奇数和偶数的个数
            while (group > 0) {
                int digit = group % 10;  // 获取当前数字的最后一位
                if (digit % 2 == 1) { // 奇数
                    groupOddCount++;
                } else { // 偶数
                    groupEvenCount++;
                }
                group /= 10;  // 去掉最后一位
            }

            // 计算新的状态
            int newEvenCount = evenCount * groupEvenCount + oddCount * groupOddCount;
            int newOddCount = evenCount * groupOddCount + oddCount * groupEvenCount;

            // 更新状态
            evenCount = newEvenCount;
            oddCount = newOddCount;
        }

        return evenCount; // 返回和为偶数的组合数
    }

    public static void main(String[] args) {
        // 测试用例
        System.out.println(solution(new int[] { 123, 456, 789 }) == 14);  // 和为偶数的组合数: 14
        System.out.println(solution(new int[] { 123456789 }) == 4);      // 和为偶数的组合数: 4
        System.out.println(solution(new int[] { 14329, 7568 }) == 10);    // 和为偶数的组合数: 10
    }
}
