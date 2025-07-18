package com.method;
import com.entity.*;
public class demo_148 {
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode sortList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        boolean swapped;
//        ListNode current;
//        ListNode tail = null;
//
//        do {
//            swapped = false;
//            current = head;
//
//            while (current.next != tail) {
//                if (current.val > current.next.val) {
//                    // Swap the values
//                    int temp = current.val;
//                    current.val = current.next.val;
//                    current.next.val = temp;
//                    swapped = true;
//                }
//                current = current.next;
//            }
//            tail = current;
//        } while (swapped);
//
//        return head;
//    }
//}