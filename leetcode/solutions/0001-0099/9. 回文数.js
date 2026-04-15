/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if (x < 0) return false;
    
    let t1 = x.toString();
    let t2 = t1.split('').reverse().join('');
    return t1 === t2;
};
    