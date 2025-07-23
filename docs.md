```java
//            if(t==(int)t) return true;
//通过该方法比较是否能找到整数平方根
```

- 出现定长的时候 往往要考虑维护一个滑动窗口
- 一个数组判断两个数的关系 通过哈希表初始为0 让j指针先行一步 避免重复判断 只对之前的i进行判断是否成对 也就是枚举左边 维护右边
- Integer.parseInt(binary1, 2);  二进制字符转化成十进制
- 在 JavaScript 中，const _ 是一种常见的命名约定，表示一个变量虽然被声明了，但不会被使用（即忽略该变量的值）
- json.stringify参数还可以是数组
- int mx = Arrays.stream(nums).max().getAsInt();获取到最大值

```js
const readline = require('readline');
// rl.question 是 Node.js 中 readline 模块提供的一个方法，用于从命令行中读取一行输入。
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("请输入字符串：", function(s) {
    console.log("最长子串长度为：", lengthOfLongestSubstring(s));
    rl.close();
});
//获取控制台输入
```

- 刷题感悟： 今天写昨天写的题的博客 及时复习
