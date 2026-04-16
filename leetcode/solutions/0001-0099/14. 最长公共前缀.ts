function longestCommonPrefix(strs: string[]): string {
    if(strs.length === 0) {
        return "";
    }
    let ans = ""
    let min = Math.min(...strs.map(item => item.length))
    for(let i = 0; i < min; i++) {
        let c = strs[0][i]
        for(let j = 1; j < strs.length; j++) {
            if(strs[j][i] !== c) {
                return ans;
            }
        }
        ans += c
    }
    return ans;
};