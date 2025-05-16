/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    let ans = -1;
    let l = 0,r = nums.length - 1;
    while (l <= r){ //记得取等 不然漏元素
        let mid = l + Math.floor((r - l)/2);
        let temp = nums[mid];
        if(temp == target) return mid;
        else if(temp > target) r = mid -1;
        else l = mid+1;
    }
    return -1;
};