/**
 Do not return anything, modify nums in-place instead.
 */
function moveZeroes(nums: number[]): void {
    if(nums.length === 0) return;
    let cur = 0;
    for (let i = 0; i < nums.length; i++){
        if(nums[i] !== 0){
            nums[cur] = nums[i];
            cur++;

        }

    }

    for (let i = cur; i < nums.length; i++){
        nums[i] = 0;
    }
};