//package com.method;
//import com.entity.ListNode;
///*K个一组反转链表*/
//public class demo_25 {
//}
//
//
//class Solution {
//    public ListNode reverseKGroup(ListNode head, int k) {
//        if (head == null || head.next == null || k <= 1) return head;
//
//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next = head;
//
//        ListNode pre = dummyHead;
//        ListNode end = dummyHead;
//
//        while (end.next != null) {
//            // 找到每组的结尾节点
//            for (int i = 0; i < k ; i++) {
//                if(end != null) end = end.next;
//            }
//            if (end == null) break; // 此时不足k个，不反转
//
//
//
//            ListNode start = pre.next;
//
//            //下一组
//            ListNode nextGroup = end.next;
//            pre.next = nextGroup;
//
//            end.next = null; // 断开连接
//
//            // 反转当前组 保持虚拟头节点
//            pre.next = reverseList(start);
//
//            // 重新连接链表
//            start.next = nextGroup;
//
//            // 重置pre和end
//            pre = start;
//            end = pre;
//        }
//
//        return dummyHead.next;
//    }
//
//    // 反转链表
//    private ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode curr = head;
//        while (curr != null) {
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }
//}