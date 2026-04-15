/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfThree = function (n) {
  return n > 0 && Math.pow(3, 19) % n === 0;
};

var isPowerOfThree = function (n) {
  for (let i = 0; i < n; i++) {
    if (Math.pow(3, i) === n) {
      return true;
    }
  }
  return false;
};

// let max = 1;
// let t = 0;
// for (let i = 0; i < Math.pow(2, 31) - 1; i++) {
//   max = Math.max(max, Math.pow(3, i));
//   if (max > Math.pow(2, 31) - 1) {
//     t = i;
//     break;
//   }
// }

// console.log(t - 1);

let ans = [];
for (let i = 0; i < Math.pow(2, 31) - 1; i++) {
  if (Math.pow(3, i) > Math.pow(2, 31) - 1) {
    break;
  }
  ans.push(Math.pow(3, i));
}

console.log(ans);

var isPowerOfThree = function (n) {
  let ans = [
    1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441,
    1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467,
  ];
  return ans.includes(n);
};
