function ListNode(val, next) {
    this.val = val === undefined ? 0 : val;
    this.next = next === undefined ? null : next;
}

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {
    // 处理空链表或单个节点的情况
    if (!head || !head.next) return true;
    
    const t1 = traverse(head);
    // 接收反转后的新头节点
    const reversedHead = reverse(head);
    const t2 = traverse(reversedHead);
    
    // 比较正序和倒序的字符串是否相同
    return t1 === t2;
};

const traverse = (head) => {
    let ans = '';
    let p = head;
    while (p) {
        ans += p.val;
        p = p.next;
    }
    return ans;
};

const reverse = (head) => {
    let prev = null;  
    let current = head; 
    
    while (current !== null) {
        const nextTemp = current.next;
        current.next = prev;
        prev = current;
        current = nextTemp;
    }
    return prev; // 返回反转后的头节点
};