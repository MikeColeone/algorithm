// 排序法
function findKthLargest(nums: number[], k: number): number {
    nums.sort((a,b)=>b-a);
    console.log(nums);
    return nums[k-1];
};


