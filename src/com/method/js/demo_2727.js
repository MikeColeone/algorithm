/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    return Object.keys(obj).length === 0
};


/*调用json.stringify函数 判断长度是不是小于2*/
/*var isEmpty = function(obj) {
    if (JSON.stringify(obj).length <= 2) return true
    else return false
};*/