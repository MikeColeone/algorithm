/**
 * @param {number} n
 * @return {boolean}
 */
var checkPowersOfThree = function(n) {
    while (n > 0){
        if(n%3 === 2){
            return false;
        }
        n = Math.floor(n/3);
    }
    return true;
    
};


// 套用到N进制同样如此