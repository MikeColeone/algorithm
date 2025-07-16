function maxEvents(events: number[][]): number {
    //经典例题 越早结束越要优先参加

    events.sort((a,b)=> a[1] - b[1]);
    console.log(events)
    let ans = 1;
    let last = -1;
    for (let [i , j] of events){
        if(i > last){
            ans++;
            last = j;
        }
    }

    return ans;


};
const events= [[1,2],[2,3],[3,4],[1,2]]
const ans = maxEvents(events);
console.log(ans)