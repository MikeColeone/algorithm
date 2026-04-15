/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function (nums) {
  let i = 0;
  let j = 0;
  let ans = 0;
  while (i < nums.length - 1) {
    j++;
    if (nums[i] === nums[j]) {
      ans++;
    }
    if (j === nums.length - 1) {
      i++;
      j = i;
    }
  }
  return ans;
};
