/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
   int m = matrix.length, n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int u = 0, d = m - 1, l = 0, r = n - 1;   //卡出边界
        //逐层遍历 收缩矩阵
        while (u <= d && l <= r) {
            for (int i = l; i <= r; i++) res.add(matrix[u][i]);
            u++;
            for (int i = u; i <= d; i++) res.add(matrix[i][r]);
            r--;
            if (u <= d) {
                for (int i = r; i >= l; i--) res.add(matrix[d][i]);
                d--;
            }
            if (l <= r) {
                for (int i = d; i >= u; i--) res.add(matrix[i][l]);
                l++;
            }
        }

        return res;
};