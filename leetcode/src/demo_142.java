//public class demo_142 {
//}
//
//
//
//class ListNode {
//  int val;
//  ListNode next;
//  ListNode(int x) {
//      val = x;
//      next = null;
//  }
//}
//
//public class Solution {
//    public ListNode detectCycle(ListNode head) {
//        if(head.next==null) return null;
//        ListNode slow = head;
//        ListNode fast = head;
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