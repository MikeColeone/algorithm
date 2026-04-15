/**
 * @param {string} s
 * @return {number}
 */
var maxScore = function (s) {
  let j = 0; // 划分左右
  let ans = 0;
  for (let i = 1; i < s.length; i++) {
    const left = countT(s.substring(0, i), "0");
    const right = countT(s.substring(i), "1");
    ans = Math.max(ans, left + right);
  }
  return ans;
};

const countT = (s, t) => {
  let ans = 0;
  for (let i = 0; i < s.length; i++) {
    if (s[i] === t) {
      ans++;
    }
  }
  return ans;
};
