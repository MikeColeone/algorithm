/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    // 边界条件判断
    if (!matrix || matrix.length === 0 || matrix[0].length === 0) {
        return false;
    }
    
    // 先锁定所在的行
    const row = locateRow(target, matrix);
    // 如果行索引无效，直接返回false
    if (row === -1) {
        return false;
    }
    
    // 在找到的行中进行二分查找
    let left = 0, right = matrix[row].length - 1;
    while (left <= right) {
        const mid = left + Math.floor((right - left) / 2);
        if (matrix[row][mid] === target) {
            return true;
        } else if (matrix[row][mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    
    return false;
};


const locateRow = (target, matrix) => {
    let left = 0, right = matrix.length - 1;
    let resultRow = -1; // 默认值表示未找到可能的行
  
    while (left <= right) {
        let mid = left + ((right - left) >> 1);
        
        if (matrix[mid][0] === target) {
            return mid; 
        } else if (matrix[mid][0] > target) {
            // 不能保证第一个大于目标值就是想要的行
            right = mid - 1;
        } else {
            resultRow = mid;
            left = mid + 1;
        }
    }
    
    return resultRow;
}
