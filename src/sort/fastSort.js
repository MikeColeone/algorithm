const { ppid } = require("process");


function fastSort(arr) {
    let left = [];
    let right = [];
    let length = arr.length;
    
    if (length <= 1) return arr;
    
    let p = arr[0];
    
    for (let i = 1; i < length; i++) {
        if (arr[i] > p) {
            right.push(arr[i]);
        } else {
            left.push(arr[i]);
        }
    }
    
    return [...fastSort(left), p, ...fastSort(right)];
}



function fastSortRandom(arr){

    let left = [];
    let right = [];
    let length = arr.length;
    
    if (length <= 1) return arr;
    
    let p = arr[0];
    
    for (let i = 1; i < length; i++) {
        if (arr[i] > p) {
            right.push(arr[i]);
        } else {
            left.push(arr[i]);
        }
    }
    
    return [...fastSort(left), p, ...fastSort(right)];

}

const ans = mySort([1, 3, 5, 7, 2]);
console.log(ans); 