package com.method;

import com.entity.ListNode;

public class demo_83 {
}


/*和上一个比较*/

//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//
//        if(head == null || head.next == null) return head;
//        ListNode cur = head;
//        while (cur.next != null) {
//            if (cur.val == cur.next.val) {
//                cur.next = cur.next.next;
//            } else {
//                cur = cur.next;
//            }
//        }
//
//        return head;
//    }
//}


