/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
    if (numRows < 2) return s;
    const arr = new Array(numRows).fill(0).map(() => []);
    let flag = -1; 
    let i = 0; 
    
    for (const c of s) {
        arr[i].push(c); 
        if (i === 0 || i === numRows - 1) {
            flag = -flag;
        }
        i += flag;
    }
    
    return arr.flat().join('');
};