/**
 * @param {number} n
 * @return {number}
 */
var concatenatedBinary = function (n) {
  let ans = 0;
  for (let i = 1; i <= n; i++) {
    const binary = toBinary(i);
    ans = ((ans << binary.length) + i) % 1000000007;
  }
  return ans;
};

// 转化成二进制字符串
const toBinary = (n) => {
  let count = "";
  while (n > 0) {
    count = (n & 1) + count;
    n >>= 1;
  }
  console.log(count);
  return count;
};

concatenatedBinary(3);
