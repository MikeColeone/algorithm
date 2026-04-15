function longestConsecutive(nums: number[]): number {
    if(nums.length === 0) return 0;
    let temp:number = 1;
    let max = 1;
    nums. sort((a, b) => a - b) ;
    // console.log(nums);
    for (let i = 0; i < nums.length -1; i++){
        if (nums[i + 1] === nums[i]) {
            continue;
        }
        if(nums[i+1] === nums[i] + 1){
            temp++;
            max = Math.max(temp,max);
        }else{
            temp = 1;
        }

    }
    return max;
};