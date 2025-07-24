
type Fn = (n: number, i: number) => any

function filter(arr: number[], fn: Fn): number[] {
    let ans:number[] = [];
    for (let i in arr){
        if(fn(arr[i],Number(i))){

            ans.push(arr[i]);
        }
    }
    return ans;
};


//第一次知道 for in 的类型是string的 为什么？