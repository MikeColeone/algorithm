/**
 *
 * @param {Function} fn 执行的函数
 * @param {number} delay 防抖时间，默认200ms
 * @returns 防抖后的函数
 */
function debounce(fn, delay = 200) {
  let timer = null;
  return function (...args) {
    if (timer) {
      clearTimeout(timer);
    }
    timer = setTimeout(() => {
      fn(...args);
    }, delay);
  };
}
