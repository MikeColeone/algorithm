// 当前点之前的历史最低点买入最好


function maxProfit(prices: number[]): number {
    let ans:number = 0;
    let min:number = Number.MAX_SAFE_INTEGER;

    prices.forEach((i) =>{
        //更新最小值
        i<min?min=i:min=min;
        // console.log(min)
        //更新ans

        //多余的判断
        if(min < i){
            console.log(i);
            ans = (ans > (i-min))? ans:(i-min);
            // console.log(ans)
        }
    })
    return ans;
};