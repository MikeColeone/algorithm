/**
 * @param {string} s
 * @return {number}
 */

const readline = require('readline');
// rl.question 是 Node.js 中 readline 模块提供的一个方法，用于从命令行中读取一行输入。
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("请输入字符串：", function(s) {
    console.log("最长子串长度为：", lengthOfLongestSubstring(s));
    rl.close();
});

function lengthOfLongestSubstring(s) {
    const set = new Set();
    let l = 0, r = 0, ans = 0;

    while (r < s.length) {
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
}
