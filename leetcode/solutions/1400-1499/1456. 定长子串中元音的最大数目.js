/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
var maxVowels = function(s, k) {
    const mySet = new Set(['a', 'e', 'i', 'o', 'u']);
    let ans = 0;
    let count = 0;
    for (let i = 0; i < s.length; i++) {
        if (mySet.has(s[i])) {
            count++;
        }
        if (i >= k && mySet.has(s[i - k])) {
            count--;
        }
        ans = Math.max(ans, count);
    }
    return ans;
};