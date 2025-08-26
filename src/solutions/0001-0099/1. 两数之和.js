/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let x_map = new Map();
    for (let i = 0; i < nums.length; i++) {
        let t = target - nums[i];
        if (x_map.has(t)) {
            return [x_map.get(t), i];
        }
        x_map.set(nums[i], i);
    }
    return [];
};
    