package com.method.mySort;

public class shellSorted {

    public static void shellSort(int[] a) {
        if (a == null) {
            return;
        }
        int n = a.length;
        int gap = n;
        while (gap > 1) {
            // gap /= 2;
            gap = gap / 3 + 1;
            for (int i = 0; i < n - gap; i++) {
                int end = i;
                int x = a[end + gap];
                while (end >= 0) {
                    if (a[end] > x) {
                        a[end + gap] = a[end];
                        end -= gap;
                    } else {
                        break;
                    }
                }
                a[end + gap] = x;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2 };
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


