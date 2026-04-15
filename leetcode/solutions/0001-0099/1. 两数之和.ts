function twoSum(nums: number[], target: number): number[] {
  let x_map = new Map();
  for (let i = 0; i < nums.length; i++) {
    if (x_map.has(target - nums[i])) {
      return [i, x_map.get(target - nums[i])];
    }
    x_map.set(nums[i], i);
  }
  return [];
}
