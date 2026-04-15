var setZeroes = function(matrix) {
    const m = matrix.length;          
    const n = matrix[0].length;      
    const zeroRows = new Array(m).fill(false);  
    const zeroCols = new Array(n).fill(false); 

    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            if (matrix[i][j] === 0) {
                zeroRows[i] = true;  // 第 i 行需要置零
                zeroCols[j] = true;  // 第 j 列需要置零
            }
        }
    }

    // 第二步：根据标记数组，统一置零
    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            // 如果当前行或列需要置零，则将元素设为 0
            if (zeroRows[i] || zeroCols[j]) {
                matrix[i][j] = 0;
            }
        }
    }
};