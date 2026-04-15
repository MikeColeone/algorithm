/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function hasCycle(head: ListNode | null): boolean {
    // 处理空链表或只有一个节点且无环的情况
    if (head === null || head.next === null) {
        return false;
    }
    
    // 初始化快慢指针
    let slow: ListNode | null = head;
    let fast: ListNode | null = head.next;  // 快指针超前一步，避免初始相等
    
    // 快慢指针遍历
    while (slow !== fast) {
        // 快指针到达终点（无环）
        if (fast === null || fast.next === null) {
            return false;
        }
        
        slow = slow!.next;         // 慢指针走一步
        fast = fast.next.next;     // 快指针走两步
    }
    
    // 快慢指针相遇，存在环
    return true;
};