/**
 * @param {Function} fn
 * @return {Function}
 */



//  函数记忆
function memoize(fn) {

    return function(...args) {
        const cache = new Map();
        return function(...arg){
            
        }

    }
}


/**
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1
 */