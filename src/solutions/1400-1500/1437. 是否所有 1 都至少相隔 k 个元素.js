/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var kLengthApart = function(nums, k) {
    let t = -1;
    for (let i = 0; i < nums.length; i++){
        if(nums[i] === 1){
            if(i - t - 1 < k && t != -1) return false;
            t = i;
        }
    }
    return true;
};