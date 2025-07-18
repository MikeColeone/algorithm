function coinChange(coins: number[], amount: number): number {
    const Max = amount + 1;
    const dp: number[] = new Array(amount + 1).fill(Max);
    dp[0] = 0;

    for (let i = 1; i <= amount; i++) {
        for (const coin of coins) {
            if (coin <= i) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
    }

    return dp[amount] > amount ? -1 : dp[amount];
}
