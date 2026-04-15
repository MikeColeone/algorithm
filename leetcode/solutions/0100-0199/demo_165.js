/**
 * @param {string} version1
 * @param {string} version2
 * @return {number}
 */
var compareVersion = function(version1, version2) {
    const v1 = version1.split(".").map(removeLeadingZeros).map(Number);
    const v2 = version2.split(".").map(removeLeadingZeros).map(Number);

    const maxLength = Math.max(v1.length, v2.length);

    for (let i = 0; i < maxLength; i++) {
        const num1 = i < v1.length ? v1[i] : 0;
        const num2 = i < v2.length ? v2[i] : 0;

        if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        }
    }

    return 0;
};

// 去除字符串前导零
function removeLeadingZeros(str) {
    let t = 0;
    for (let i = 0;i < str.length;i++){ //注意这里是length - 1 而不是length 最后以为无论是是什么都不能为空
        if(str.charAt(i) === '0'){
            t++;
        }
    }
    return str.slice(t);
}