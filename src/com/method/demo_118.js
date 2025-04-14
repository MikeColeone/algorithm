//
//
// var generate = function(numRows) {
//
//     let ret = []
//     for (let i = 0;i<numRows;++i){
//         let row = []
//         for (let j = 0; j<=i;++j){
//             if(j===0||j==i){
//                 row.push(1);
//             }
//             else{
//                 row.push(ret[i-1][j-1]+ret[i-1][j]);
//             }
//
//         }
//         ret.push(row);
//     }
//     return ret;
// };