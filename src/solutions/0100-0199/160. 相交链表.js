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
//判断链表是否相交
function getIntersectionNode(headA: ListNode | null, headB: ListNode | null): ListNode | null {
    let pa = headA, pb = headB;
    //一定会相交 
    while (pa !== pb) {
        pa = pa ? pa.next : headB;
        pb = pb ? pb.next : headA;
    }
    return pa; 
}