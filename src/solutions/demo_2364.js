const countBadPairs = (nums)=>{
    const mp = new Map();
    let res = 0;
    for (let i = 0;i <nums.length;i++){
        const key = nums[i] - i;
        res += i - (mp.get(key) || 0);
        mp.set(key,(mp.get(key)||0) +1);
    }
    return res;
}