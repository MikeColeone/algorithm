# 📘 LeetCode 刷题笔记与算法进阶

> 🚀 持续更新中... 涵盖经典题型、算法技巧分类及日常手写练习。

---

## 💡 刷题感悟

刷题不仅仅是为了应对面试，作为一名开发者，扎实的算法能力对日常编码和架构设计起着举足轻重的作用。在刷题过程中，我有以下几点感悟：

- **专项训练优于盲目刷题**：按知识点（如动态规划、滑动窗口、双指针等）进行专项突破，更容易建立起系统化的知识体系。
- **难度需循序渐进**：刚开始时如果每天死磕“每日一题”，往往会因为掌握不够全面而没有思路，进而产生挫败感并放弃。建议从基础题型开始打好地基。

📌 **入门推荐**：[LeetCode 简单题入门计划](https://leetcode.cn/studyplan/primers-list/)

---

## 📁 项目目录结构

本项目不仅包含 LeetCode 算法题解，还整理了相关的专项训练和日常代码片段：

```text
.
├── daily-code/                             # 💡 日常代码片段与前端手写练习
├── leetcode/                               # 🎯 核心刷题与算法目录
│   ├── data-structures-challenge/          # 🧱 数据结构专项挑战（如 array-1, array-2 等）
│   ├── js-challenge/                       # 🟨 JavaScript 专场挑战（涵盖闭包、异步等前端特有题型）
│   ├── solutions/                          # 📝 主力题解目录，包含不同语言的实现 (Java, JS, TS, Python, C++ 等)
│   │   ├── 0001-0099/                      # 按题号百位区间分类，结构清晰，方便检索
│   │   ├── 0100-0199/
│   │   ├── 0200-0299/
│   │   └── ...                             # 其他题号区间分类
│   └── test/                               # 🧪 测试代码与本地运行调试脚本
└── README.md                               # 📖 项目主文档说明
```

---

## 📚 题目分类与沉淀

> 💡 **提示**：以下题目的具体代码实现均统一存放在 [`leetcode/solutions/`](./leetcode/solutions/) 目录下，按题号百位区间划分。

### 🧮 动态规划（DP）

- [322. 零钱兑换](https://leetcode.cn/problems/coin-change/)
- [1143. 最长公共子序列](https://leetcode.cn/problems/longest-common-subsequence/)
- [42. 接雨水](https://leetcode.cn/problems/trapping-rain-water/)
- [6. 小E的怪物挑战 (豆包)](https://leetcode.cn/)

### 📏 滑动窗口（Sliding Window）

- [3. 无重复字符的最长子串](https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/)
- [438. 找到字符串中所有字母异位词](https://leetcode.cn/problems/find-all-anagrams-in-a-string/)
- [1423. 可获得的最大点数](https://leetcode.cn/problems/maximum-points-you-can-obtain-from-cards/)
- [1652. 拆炸弹](https://leetcode.cn/problems/defuse-the-bomb/)
- [2962. 最大元素出现至少 K 次的子数组](https://leetcode.cn/problems/count-subarrays-where-max-element-appears-at-least-k-times/)

### 🎯 双指针（Two Pointers）

- [233. 平方数之和](https://leetcode.cn/problems/sum-of-square-numbers/)

### 🔗 链表 & 常用数据结构

- [121. 买卖股票的最佳时机](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/)
- [219. 存在重复元素 II](https://leetcode.cn/problems/contains-duplicate-ii/)
- [1679. K 和数对的最大数目](https://leetcode.cn/problems/max-number-of-k-sum-pairs/)
- 📚 **拓展**：前缀和 / 差分 / 栈 / 队列 / 堆 / 字典树 / 并查集 / 树状数组 / 线段树 [总结帖](https://leetcode.cn/circle/discuss/mOr1u6/)

### 🔢 前缀和

- [2845. 统计趣味子数组的数目](https://leetcode.cn/problems/count-of-interesting-subarrays/)

### 🧊 数组与模拟

- [2390. 从字符串移除星号](https://leetcode.cn/problems/removing-stars-from-a-string/) *(模拟)*
- [3392. 长度为 3 的子数组数目](https://leetcode.cn/problems/count-subarrays-of-length-three-with-a-condition/)
  > 💡 **Tip:** 注意精度问题，建议用乘法代替除法判断。
  >

### 🔢 哈希表（Hash Table）

- [1399. 统计最大组的数目](https://leetcode.cn/problems/count-largest-group/)

### 📚 栈（Stack）

- [20. 有效的括号](https://leetcode.cn/problems/valid-parentheses/)

### 🔍 二分算法（Binary Search）

- [34. 在排序数组中查找元素的第一个和最后一个位置](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/)

### 🧠 分治算法（Divide & Conquer）

- [50. Pow(x, n)](https://leetcode.cn/problems/powx-n/)

### 💡 贪心算法（Greedy）

- [2071. 你可以安排的最多任务数目](https://leetcode.cn/problems/maximum-number-of-tasks-you-can-assign/)

### 📐 数学方法

- [73. 矩阵置零](https://leetcode.cn/problems/set-matrix-zeroes/)
- [838. 推多米诺](https://leetcode.cn/problems/push-dominoes/)

### 🧮 位运算（Bit Manipulation）

- [260. 只出现一次的数字 III](https://leetcode.cn/problems/single-number-iii/)
  > 🤔 **思考题:** 如何找出两个只出现一次的数字？（阿里二面题）
  >

### 🌊 深度/广度优先搜索（DFS / BFS）

- [200. 岛屿数量](https://leetcode.cn/problems/number-of-islands/)

### 🚧 待补充专题

- 🔍 回溯算法（Backtracking）
- ⛏️ 堆（Heap）
- 🌳 二叉树（Binary Tree）
- 🗺️ 图论（Graph Theory）
