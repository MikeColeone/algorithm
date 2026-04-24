function maxScore(s: string): number {
    let max = 0
    let left = 0
    // 考虑极限情况 0全部在左边
    let right = s.split('').filter(c => c === '1').length
    console.log(right)
    for (let i = 0; i < s.length - 1; i++) {
        if (s[i] === '0') {
            left++
        } else {
            right--
        }
        max = Math.max(max, left + right)
    }
    return max
};