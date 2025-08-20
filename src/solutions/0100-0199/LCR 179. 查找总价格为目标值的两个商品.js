/**
 * @param {number[]} price
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(price, target) {
    let i = 0;
    let j = price.length -1;
    while (i < j){
        if(price[i] + price[j] === target){
            return [price[i],price[j]];
        }else if(price[i] + price[j] > target){
            j--;
        }else{
            i++;
        }

    }
    return;
};