/**
 * @param {string} s
 * @param {number} k
 * @return {boolean}
 */
var hasAllCodes = function (s, k) {
  let set = new Set();
  for (let i = k; i <= s.length; i++) {
    const subStr = s.substring(i - k, i);
    set.add(subStr);
  }
  //   if (set.size !== Math.pow(2, k)) {
  //     return false;
  //   }
  //   return true;

  // 位运算会稍微快一点
  return set.size === 1 << k;
};
