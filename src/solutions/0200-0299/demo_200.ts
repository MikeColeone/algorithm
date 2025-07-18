function numIslands(grid) {
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

        grid[i][j] = '0';

        dfs(i + 1, j); // 下
        dfs(i - 1, j); // 上
        dfs(i, j + 1); // 右
        dfs(i, j - 1); // 左
    };

    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            if (grid[i][j] === '1') {
                count++;
                dfs(i, j);
            }
        }
    }

    return count;
}


function numIslandsBFS(grid) {
    if (!grid || grid.length === 0) return 0;

    const rows = grid.length;
    const cols = grid[0].length;
    let count = 0;

    const directions = [
        [1, 0], // 下
        [-1, 0], // 上
        [0, 1], // 右
        [0, -1] // 左
    ];

    const bfs = (i, j) => {
        const queue = [[i, j]];
        grid[i][j] = '0'; // 标记为已访问（淹没）

        while (queue.length > 0) {
            const [x, y] = queue.shift();

            for (const [dx, dy] of directions) {
                const nx = x + dx;
                const ny = y + dy;

                if (
                    nx >= 0 && nx < rows &&
                    ny >= 0 && ny < cols &&
                    grid[nx][ny] === '1'
                ) {
                    grid[nx][ny] = '0'; // 标记为已访问
                    queue.push([nx, ny]);
                }
            }
        }
    };

    for (let i = 0; i < rows; i++) {
        for (let j = 0; j < cols; j++) {
            if (grid[i][j] === '1') {
                count++;
                bfs(i, j);
            }
        }
    }

    return count;
}

const grid = [["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]];