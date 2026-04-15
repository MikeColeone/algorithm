
async function sleep(millis) {
    return new Promise((resolve) => {
            setTimeout(resolve, millis);
  });
}

// console.log(promise)

/*异步编程*/
/*一旦调用setTimeout函数 js启动设置定时器 随后执行任何可执行代码  回调函数执行延迟稍长 由于事件驱动的js运行时单线程事件循环性质决定 由加入js相乘有一个较长时间要完成的任务在队列里
* 就会优先完成这个任务 之后在进行回调 所以这是最小延迟 不是保证延迟 所以时间会超过规定执行的时间*/