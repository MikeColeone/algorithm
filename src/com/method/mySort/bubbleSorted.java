package com.method.mySort;


/*冒泡排序
* 时间复杂度
* 空间复杂度
* 稳定性： 稳定的
*
*
* */
public class bubbleSorted {

    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 4, 2};
        System.out.println("Before sorting:");
        printArray(nums);

        sorted(nums);

        System.out.println("After sorting:");
        printArray(nums);
    }

    public static void sorted(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            // 提前退出优化：如果一轮下来没有交换，说明已经排好序
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
