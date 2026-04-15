function orangesRotting(grid) {
    const m = grid.length;
    const n = grid[0].length;
    const INF = Infinity;
    
    // 时间矩阵：记录每个橘子被感染的最早时间
    const time = Array.from({ length: m }, () => Array(n).fill(INF));
    let freshCount = 0;  // 新鲜橘子数量
    const rottens = [];  // 初始腐烂橘子的坐标
    
    // 初始化时间矩阵和统计信息
    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            if (grid[i][j] === 2) {
                time[i][j] = 0;  // 初始腐烂橘子时间为0
                rottens.push([i, j]);
            } else if (grid[i][j] === 1) {
                freshCount++;
            } else {  // 空单元格
                time[i][j] = -1;
            }
        }
    }
    
    // 如果没有新鲜橘子，直接返回0
    if (freshCount === 0) return 0;
    
    // 四个方向：上、下、左、右
    const directions = [[-1, 0], [1, 0], [0, -1], [0, 1]];
    
    // DFS函数：更新感染时间
    function dfs(x, y, currentTime) {
        for (const [dx, dy] of directions) {
            const nx = x + dx;
            const ny = y + dy;
            
            // 检查边界
            if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                // 只有新鲜橘子且能被更早感染时才更新
                if (grid[nx][ny] === 1 && time[nx][ny] > currentTime + 1) {
                    time[nx][ny] = currentTime + 1;
                    dfs(nx, ny, currentTime + 1);
                }
            }
        }
    }
    
    // 多次执行DFS直到没有更新，模拟同步扩散
    let changed = true;
    while (changed) {
        changed = false;
        // 保存当前时间矩阵状态
        const prevTime = time.map(row => [...row]);
        
        // 对每个初始腐烂橘子执行一次DFS
        for (const [x, y] of rottens) {
            dfs(x, y, time[x][y]);
        }
        
        // 检查是否有更新
        for (let i = 0; i < m; i++) {
            for (let j = 0; j < n; j++) {
                if (time[i][j] !== prevTime[i][j]) {
                    changed = true;
                    break;
                }
            }
            if (changed) break;
        }
    }
    
    // 计算最大感染时间并检查是否有无法感染的橘子
    let maxTime = 0;
    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            if (grid[i][j] === 1) {  // 新鲜橘子
                if (time[i][j] === INF) {  // 无法感染
                    return -1;
                }
                maxTime = Math.max(maxTime, time[i][j]);
            }
        }
    }
    
    return maxTime;
}

