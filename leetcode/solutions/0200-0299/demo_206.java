//public class demo_206 {
//}
//
//
//
///*反转链表*/
//
// public class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
//
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode cur = head;
//        ListNode temp = null;
//        while (cur != null) {
//            temp = cur.next;// 保存下一个节点
//            cur.next = prev;
//            prev = cur;
//            cur = temp;
//        }
//        return prev;
//    }
//}