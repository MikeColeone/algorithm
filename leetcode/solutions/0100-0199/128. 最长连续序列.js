/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums) {
    if (nums.length === 0) return 0;

    nums.sort((a, b) => a - b); // 升序排序

    let current = 1;
    let max = 1;

    for (let i = 0; i < nums.length - 1; i++) {
        if (nums[i] === nums[i + 1]) {
             // 跳过重复值
        } else if (nums[i + 1] === nums[i] + 1) {
            current++; // 连续，累加
        } else {
            max = Math.max(max, current); // 更新最大值
            current = 1; // 重置
        }
    }

    return Math.max(max, current); // 处理最后一段

};