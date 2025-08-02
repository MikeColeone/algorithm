function getIntersectionNode(headA: ListNode | null, headB: ListNode | null): ListNode | null {
    let pa = headA;
    let pb = headB;
    while (pa && pb){
     
        if(pa === pb) return pa;
        if(pa.next == null){
            pa = headB;
        }else if(pb.next == null){
            pa = headB;
        }
        pa = pa.next;
        pb = pb.next;
    }
    return null;
};