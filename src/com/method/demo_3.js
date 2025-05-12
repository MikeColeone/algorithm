/**
 * @param {string} s
 * @return {number}
 */

// 3. 无重复字符的最长子串

var lengthOfLongestSubstring = function(s) {
    const set = new Set();
    let l = 0, r = 0, ans = 0;
    const n = s.length;

    while (r < n) {
        if (!set.has(s[r])) {
            set.add(s[r]);
            ans = Math.max(ans, r - l + 1);
            r++;
        } else {
            set.delete(s[l]);
            l++;
        }
    }

    return ans;
};
