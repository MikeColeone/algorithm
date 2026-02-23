// /**
//  * @param {string} s
//  * @return {string}
//  */
// var toLowerCase = function (s) {
//   return s.toLowerCase();
// };

/**
 * @param {string} s
 * @return {string}
 */
var toLowerCase = function (s) {
  let ans = "";
  for (let i = 0; i < s.length; i++) {
    const charCode = s.charCodeAt(i);
    if (charCode >= 65 && charCode <= 90) {
      ans += String.fromCharCode(charCode + 32);
    } else {
      ans += s[i];
    }
  }
  return ans;
};
