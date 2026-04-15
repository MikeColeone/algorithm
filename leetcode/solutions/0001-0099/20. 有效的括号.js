/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    //先进行初步判断
    let n = s.length;
    if(n%2!==0) return false;
    let arr = [] //模拟栈结构
    //左括号入栈
    const pairs = {
        "(":")",
        "[":"]",
        "{":"}"
    }

    for (let i = 0; i < n; i++){
        let temp = s.chratAt(i);
        if(pairs[temp]){
            arr.push(temp)
        }else{
            if(arr.length === 0) return;
            else{
                const top = arr.pop();
                if(pairs[top]!==temp) return false;
            }
        }
    }
    return arr.length === 0;
};