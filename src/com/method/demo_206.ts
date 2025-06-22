
function reverseList(head: ListNode | null): ListNode | null {
    let pre: ListNode | null = null;
    let cur: ListNode | null = head;

    while (cur != null) {
        const temp: ListNode | null = cur.next;
        cur.next = pre;
        pre = cur;
        cur = temp;
    }
    return pre;
};