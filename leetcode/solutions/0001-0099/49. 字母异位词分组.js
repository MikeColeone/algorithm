/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    const map = new Map();
    
    for (const str of strs) {
        // 将字符串拆分为字符数组，排序后再拼接成字符串作为键
        const key = Array.from(str).sort().join('');
        
        // 如果键已存在，将当前字符串添加到对应的数组中
        // 如果键不存在，创建新的数组并添加当前字符串
        if (map.has(key)) {
            map.get(key).push(str);
        } else {
            map.set(key, [str]);
        }
    }
    
    // 将Map中的值转换为数组返回
    return Array.from(map.values());
};
