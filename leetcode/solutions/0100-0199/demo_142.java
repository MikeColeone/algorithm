//package com.method;
//import com.entity.*;
//import com.service.LinkService;
//
//import java.util.LinkedList;
//
//class Solution {
//    public ListNode detectCycle(ListNode head) {
//        //当为空的时候返回空值
//        if(head==null) return null;
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while (fast.next!=null&&fast.next.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow==fast){
//                fast = head;
//                while (fast!=slow){
//                    slow=slow.next;
//                    fast=fast.next;
//                }
//                return slow;
//            }
//        }
//        return null;
//
//    }
//}
//
//public class demo_142 {
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        ListNode head = null;
//        LinkService.createLinkList(head);
//        solution.detectCycle(head);
//        LinkService.printLinkList(head);
//    }
//
//}