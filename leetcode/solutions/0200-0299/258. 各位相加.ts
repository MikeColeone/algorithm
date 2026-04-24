function addDigits(num: number): number {
    if (num < 10) {
        return num
    }
    return addDigits(Math.floor(num / 10) + num % 10)
};