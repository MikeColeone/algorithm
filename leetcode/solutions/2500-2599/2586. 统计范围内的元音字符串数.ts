function vowelStrings(words: string[], left: number, right: number): number {
    const vowels = 'aeiou'
    let count = 0
    for (let i = left; i <= right; i++) {
        if (vowels.includes(words[i][0]) && vowels.includes(words[i][words[i].length - 1])) {
            count++
        }
    }
    return count
};