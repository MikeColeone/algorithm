function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
}


var reverseList = function(head) {
    let cur = head;
    let newHead = null;
    while (cur != null){
        let next = cur.next;
        cur.next = newHead;
        newHead = cur;
        cur = next;
    }
    return newHead;
};