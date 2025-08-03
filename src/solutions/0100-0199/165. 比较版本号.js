/**
 * @param {string} version1
 * @param {string} version2
 * @return {number}
 */
var compareVersion = function(version1, version2) {
    // 分割版本号并处理前导零，转为数字数组
    const v1 = version1.split(".").map(str => Number(removeLeadingZeros(str)));
    const v2 = version2.split(".").map(str => Number(removeLeadingZeros(str)));

    const maxLength = Math.max(v1.length, v2.length);

    for (let i = 0; i < maxLength; i++) {
        const num1 = i < v1.length ? v1[i] : 0;
        const num2 = i < v2.length ? v2[i] : 0;

        if (num1 > num2) {
            return 1; // version1 更大，返回 1
        } else if (num1 < num2) {
            return -1; // version1 更小，返回 -1
        }
    }

    // 所有段落都相等
    return 0;
};

function removeLeadingZeros(str) {
    return str.replace(/^0+/, '') || "0";
}
