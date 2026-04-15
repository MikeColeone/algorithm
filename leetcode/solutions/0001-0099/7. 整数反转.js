/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let temp = x.toString();
    let ans = "";
    let isNegative = false;
    
    // 检查是否为负数
    if (temp[0] === '-') {
        isNegative = true;
        // 从第二个字符开始处理，跳过负号
        for (let i = temp.length - 1; i >= 1; i--) {
            ans += temp[i];
        }
    } else {
        // 正数正常反转
        for (let i = temp.length - 1; i >= 0; i--) {
            ans += temp[i];
        }
    }
    
    // 转换为数字并应用符号
    let result = Number(ans);
    if (isNegative) {
        result = -result;
    }
    
    // 检查32位有符号整数范围
    const min = -2147483648; // -2^31
    const max = 2147483647;  // 2^31 - 1
    if (result < min || result > max) {
        return 0;
    }
    
    return result;
};

