//package com.method;
//
//import java.util.*;
//
//public class demo_15 {
//
//    public static void main(String[] args) {
//        final int MAX = 100005;
//        int times = 10;
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            int n = scanner.nextInt();
//
//            int[] nums = new int[n];
//            Random random = new Random();
//            for (int i = 0; i < n; i++) {
//                nums[i] = random.nextInt(2001) - 1000;  // 生成 [-1000, 1000] 范围内的随机数
//            }
//
//
//            System.out.println("===================");
//            // 暴力求解
//            long startTime1 = System.currentTimeMillis();
//            for (int i = 0; i < times; i++) {
//                Solution01.threeSum(nums);
//                System.out.println("===================");
//            }
//            long endTime1 = System.currentTimeMillis();
//            System.out.println("暴力求解耗时: " + (endTime1 - startTime1) / times + " 毫秒");
//
//            // 双指针
//            long startTime2 = System.currentTimeMillis();
//            for (int i = 0; i < times; i++) {
//                Solution02.threeSum(nums);
//            }
//            long endTime2 = System.currentTimeMillis();
//            System.out.println("双指针耗时: " + (endTime2 - startTime2) / times + " 毫秒");
//
//            // 双指针去重
//            long startTime3 = System.currentTimeMillis();
//            for (int i = 0; i < times; i++) {
//                Solution03.threeSum(nums);
//            }
//            long endTime3 = System.currentTimeMillis();
//            System.out.println("双指针去重耗时: " + (endTime3 - startTime3) / times + " 毫秒");
//        }
//    }
//}
//
//
//
////无脑包利发
//class Solution01 {
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>(); // 初始化为一个空列表
//        nums = Arrays.stream(nums).sorted().toArray();
//
//        if (nums[0] > 0) return ans;  // 返回空的结果
//
//        int n = nums.length - 2;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n + 1; j++) {
//                for (int k = j + 1; k < n + 2; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
//
//                        // 去重检查，避免重复添加同样的三元组
//                        if (!ans.contains(list)) {
//                            ans.add(list);
//                        }
//                        break;
//                    }
//                }
//            }
//        }
//
//        return ans;
//    }
//}
//
////双指针
//class Solution02 {
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        Arrays.sort(nums);  // 先排序数组
//
//        int n = nums.length;
//        for (int i = 0; i < n - 2; i++) {
//
//            int left = i + 1, right = n - 1;
//            while (left < right) {
//                int sum = nums[i] + nums[left] + nums[right];
//                if (sum == 0) {
//                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
//                    if (!ans.contains(list)) {
//                        ans.add(list);
//                    }
//
//                    left++;
//                    right--;
//                } else if (sum < 0) {
//                    left++;
//                } else {
//                    right--;
//                }
//            }
//        }
//        return ans;
//    }
//}
//
//
////双指针优化 直接跳过相同情况
//
//class Solution03 {
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        Arrays.sort(nums);  // 先排序数组
//
//        int n = nums.length;
//        for (int i = 0; i < n - 2; i++) {
//            // 跳过重复的第一个数
//            if (i > 0 && nums[i] == nums[i - 1]) continue;
//
//            int left = i + 1, right = n - 1;
//            while (left < right) {
//                int sum = nums[i] + nums[left] + nums[right];
//                if (sum == 0) {
//                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
//
//                    // 跳过重复的第二个数（left）
//                    while (left < right && nums[left] == nums[left + 1]) left++;
//                    // 跳过重复的第三个数（right）
//                    while (left < right && nums[right] == nums[right - 1]) right--;
//
//                    left++;
//                    right--;
//                } else if (sum < 0) {
//                    left++;
//                } else {
//                    right--;
//                }
//            }
//        }
//        return ans;
//    }
//}
//
//
////其实就是两数相加的变式 排序+双指针 亮点是跳过重复的数 虽然没有直接的把时间复杂度减少一个维度 但是在较大用例数的时候也减少了很多时间
////1000
////        ===================
////        ===================
////        ===================
////        ===================
////        ===================
////        ===================
////        ===================
////        ===================
////        ===================
////        ===================
////        ===================
////暴力求解耗时: 8453 毫秒
////双指针耗时: 7554 毫秒
////双指针去重耗时: 4 毫秒
////显然用时差了很多