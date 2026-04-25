/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function(nums) {
    const n = nums.length;
    if (n === 0) {
        return 0
    }
    if (n === 1) {
        return nums[0]
    }
 
    let arr = [nums[0], Math.max(nums[0], nums[1])]
    for (let i = 2; i < n; i++) {
        arr.push(Math.max(arr[i - 1], arr[i - 2] + nums[i]))
    }
    return arr[n - 1]
};