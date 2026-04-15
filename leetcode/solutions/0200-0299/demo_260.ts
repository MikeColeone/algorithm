//
//
// //最直观的方式当然是hash map
// var singleNumber = function(nums) {
//     const map = new Map();
//
//     for (let num of nums){
//         let t = map.get(num) || 0;
//         map.set(num,t+1);
//     }
//
//     let ans = []
//     for (let [k,v] of map.entries()){
//         if(v === 1){
//             ans.push(k)
//         }
//     }
//     return ans;
//
// };
//
// var singleNumber = function(nums) {
//     let temp = 0;
//     for (num of nums){
//         // console.log(num)
//         temp ^= num;
//
//         // console.log(temp)
//     }
//
//     // console.log(temp);
//     let k = (temp & (-temp));
//
//     //  console.log(k);
//     let ans1 = 0;
//     let ans2 = 0;
//     for (num of nums){
//         if((num & k) === 0) {
//             ans1 ^= num;
//         }else{
//             ans2 ^= num;
//
//         }
//     }
//     return [ans1,ans2];
//
// };