// /**
//  * @param {number[]} cost
//  * @return {number}
//  */
// var minCostClimbingStairs = function(cost) {
//     let arr = [cost[0], cost[1]]
//     // 这里的cost不能理解为在这位置向上才需要支付 而是路径包括这个点的时候的代价
//     for (let i = 2; i < cost.length; i++) {
//         arr.push(Math.min(arr[i - 1], arr[i - 2]) + cost[i])
//     }
//     // 到最后 又不需要包括最高点 从 n-1 或 n-2 上去即可
//     return Math.min(arr[cost.length - 1], arr[cost.length - 2])
// };

// 超时
// /**
//  * @param {number[]} cost
//  * @return {number}
//  */
// var minCostClimbingStairs = function(cost) {
//     const n = cost.length
//     function dp(i) {
//         if (i >= n) {
//             return 0
//         }
//         return Math.min(dp(i + 1), dp(i + 2)) + cost[i]
//     }
//     return Math.min(dp(0), dp(1))
// };