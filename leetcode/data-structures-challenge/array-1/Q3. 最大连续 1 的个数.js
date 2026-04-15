/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function (nums) {
  let max = 0;
  let temp = 0;
  for (let x of nums) {
    if (x === 1) {
      temp++;
      max = Math.max(max, temp);
    } else temp = 0;
  }
  return max;
};
