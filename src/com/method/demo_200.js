/*岛屿数量*/

/**
 * @param {character[][]} grid
 * @return {number}
 */
/**
 * @param {character[][]} grid
 * @return {number}
 */
var numIslands = function(grid) {
    if (!grid || grid.length === 0) return 0;

    const rows = grid.length;
    const cols = grid[0].length;
    let count = 0;

    const dfs = (i, j) => {
        if (
            i < 0 || i >= rows ||
            j < 0 || j >= cols ||
            grid[i][j] === '0'
        ) return;

        grid[i][j] = '0'; // 标记为已访问

        dfs(i + 1, j); // 下
        dfs(i - 1, j); // 上
        dfs(i, j + 1); // 右
        dfs(i, j - 1); // 左
    };

    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            if (grid[i][j] === '1') {
                count++;
                dfs(i, j); // 从当前点出发把整个岛淹掉
            }
        }
    }

    return count;
};
