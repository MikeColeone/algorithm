/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */

/*防抖*/
var debounce = function(fn, t) {

    let timer = null
    return function(...args) {
        if(timer) {
            clearTimeout(timer)

        }
        timer = setTimeout(()=>{fn(...args)}, t)

    }
};

/**
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */