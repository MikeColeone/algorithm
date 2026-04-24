// function numIdenticalPairs(nums: number[]): number {
//     let result = 0
//     for (let i = 0; i < nums.length; i++) {
//         for (let j = i + 1; j < nums.length; j++) {
//             if (nums[i] === nums[j]) {
//                 result++
//             }
//         }
//     }
//     return result
// };


function count(n: number): number {
    return n * (n - 1) / 2
}

function numIdenticalPairs(nums: number[]): number {
    let map = new Map<number, number>()
    for (let num of nums) {
        map.set(num, (map.get(num) ?? 0) + 1)
    }
    let result = 0
    for (let [key, value] of map) {
        result += count(value)
    }
    return result
};