function simplify(nums) {
    if (nums.length === 0) return "";

    const result = [];
    let l = 0; // 左指针指向区间起始
    let r = 0; // 右指针用于扩展区间

    while (r < nums.length) {
        // 检查当前元素和下一个元素是否连续
        if (r + 1 < nums.length && nums[r] + 1 === nums[r + 1]) {
            r++;
        } else {
            // 当前区间结束，处理区间结果
            result.push(specification(nums[l], nums[r]));
            r++; // 右指针前进
            l = r; // 左指针移动到新区间的起点
        }
    }

    return result.join(", ");
}

function specification(l, r) {
    return l === r ? `${l}` : `${l}-${r}`;
}

// 测试数据
const nums1 = [1, 2, 3, 4, 5, 6, 7, 8];
const nums2 = [1, 2, 3, 5, 6, 7, 8];
const nums3 = [1, 2, 4, 6, 7, 8];
const nums4 = [1];

console.log(simplify(nums1)); // 输出: "1-8"
console.log(simplify(nums2)); // 输出: "1-3, 5-8"
console.log(simplify(nums3)); // 输出: "1-2, 4, 6-8"
console.log(simplify(nums4)); // 输出: "1"
