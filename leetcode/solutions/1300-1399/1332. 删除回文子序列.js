/**
 * @param {string} s
 * @return {number}
 */
var removePalindromeSub = function(s) {
    let i = 0;
    let j = s.length - 1;
    while (i < j){
        if(s.charAt(i) != s.charAt(j)) return 2;
        i++;
        j--;
    }
    return 1;
};


// 回文字符串删一次 否则两次