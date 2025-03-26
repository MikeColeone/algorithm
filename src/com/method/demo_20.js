/**
 * @param {string} s
 * @return {boolean}
 */
function isValid(s) {
    const n = s.length;
    // 如果字符串长度为奇数，直接判定为无效括号组合
    if (n % 2 === 1) {
        return false;
    }
    // 存储括号对的映射，方便后续检查括号是否匹配
    const pairs = {
        '(': ')',
        '{': '}',
        '[': ']'
    };
    // 用数组模拟栈
    const stack = [];
    for (let i = 0; i < n; i++) {
        const c = s[i];
        // 如果当前字符是左括号，将其压入栈中
        if (pairs[c]) {
            stack.push(c);
        } else {
            // 如果栈为空，说明当前右括号没有对应的左括号，判定为无效
            if (stack.length === 0) {
                return false;
            }
            // 弹出栈顶元素
            const top = stack.pop();
            // 检查栈顶左括号对应的右括号是否和当前字符匹配
            if (pairs[top]!== c) {
                return false;
            }
        }
    }
    // 遍历结束后，如果栈为空，说明所有括号都匹配成功，返回 true；否则返回 false
    return stack.length === 0;
}
