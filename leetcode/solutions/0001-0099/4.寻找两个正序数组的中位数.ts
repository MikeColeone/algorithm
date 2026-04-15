function findMedianSortedArrays(nums1: number[], nums2: number[]): number {
    const merged = mergeArrays(nums1, nums2);
    return medianArray(merged);
}

// 合并两个排序数组并返回新数组
function mergeArrays(nums1: number[], nums2: number[]): number[] {
    const merged: number[] = [];
    let i = 0, j = 0;
    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] < nums2[j]) {
            merged.push(nums1[i]);
            i++;
        } else {
            merged.push(nums2[j]);
            j++;
        }
    }
    while (i < nums1.length) {
        merged.push(nums1[i]);
        i++;
    }
    
    while (j < nums2.length) {
        merged.push(nums2[j]);
        j++;
    }
    
    return merged;
}

// 计算数组的中位数
function medianArray(nums: number[]): number {
    const length = nums.length;
    const mid = Math.floor(length / 2);
    if (length % 2 === 1) {
        return nums[mid];
    } else {
        return (nums[mid - 1] + nums[mid]) / 2;
    }
}
