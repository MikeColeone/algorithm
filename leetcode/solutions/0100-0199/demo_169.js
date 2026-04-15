/**
 * @param {number[]} nums
 * @return {number}
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    const countMap = new Map();
    const majority = Math.floor(nums.length / 2);

    for (let num of nums) {
        countMap.set(num, (countMap.get(num) || 0) + 1);
        if (countMap.get(num) > majority) {
            return num;
        }
    }
};
