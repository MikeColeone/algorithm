/**
 * @param {number[]} nums
 * @return {number[]}
 */
var smallerNumbersThanCurrent = function (nums) {
  const sortedNums = [...nums].sort((a, b) => a - b);
  const countMap = new Map();
  for (let i = 0; i < sortedNums.length; i++) {
    if (!countMap.has(sortedNums[i])) {
      countMap.set(sortedNums[i], i);
    }
  }
  return nums.map((num) => countMap.get(num));
};
