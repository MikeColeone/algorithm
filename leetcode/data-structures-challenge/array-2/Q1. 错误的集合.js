/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findErrorNums = function (nums) {
  const countMap = new Map();
  let duplicate = -1;
  let missing = -1;
  const n = nums.length;

  for (let num of nums) {
    countMap.set(num, (countMap.get(num) || 0) + 1);

    // 直接找到重复值
    if (countMap.get(num) === 2) {
      duplicate = num;
    }
  }

  for (let i = 1; i <= n; i++) {
    if (!countMap.has(i)) {
      missing = i;
      break;
    }
  }

  return [duplicate, missing];
};
