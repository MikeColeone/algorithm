/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var reverseKGroup = function(head, k) {
    if (!head || k <= 1 || !head.next) return head;
    
    const dummy = new ListNode(0);
    dummy.next = head;
    let prevTail = dummy; 
    
    while (true) {
        let p = prevTail.next;
        let count = 0;
        while (p && count < k) {
            p = p.next;
            count++;
        }
        if (count < k) break;
        
        let currHead = prevTail.next;
        let currTail = prevTail.next;
        for (let i = 1; i < k; i++) {
            currTail = currTail.next;
        }
        
        let nextHead = currTail.next;
        
        currTail.next = null;
        const reversedHead = reverseList(currHead);
        prevTail.next = reversedHead;
        currHead.next = nextHead; 
        prevTail = currHead;
    }
    
    return dummy.next;
};

function reverseList(head) {
    let pre = null;
    let cur = head;
    while (cur !== null) {
        let p = cur.next;
        cur.next = pre;
        pre = cur;
        cur = p;
    }
    return pre;
}