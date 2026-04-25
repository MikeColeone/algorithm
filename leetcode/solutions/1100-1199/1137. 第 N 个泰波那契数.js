// /**
//  * @param {number} n
//  * @return {number}
//  */
// var tribonacci = function(n) {
//     if (n <= 2) {
//         return n
//     }
//     return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3)
// };

/**
 * @param {number} n
 * @return {number}
 */
var tribonacci = function(n) {
    let arr = [0, 1, 1]
    for (let i = 3; i <= n; i++) {
        arr.push(arr[i - 1] + arr[i - 2] + arr[i - 3])
    }
    return arr[n]
};