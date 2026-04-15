//public class demo_19 {
//
//}
//
//
//  class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
//
////class Solution {
////
////    int count(ListNode head){
////        int ans = 0;
////        ListNode p = head;
////        while (p!=null){
////            ans++;
////            p = p.next;
////           // System.out.println(ans);
////        }
////        //System.out.println(ans);
////        return ans;
////    }
////
////    void removeNode(int n,ListNode head){
////        ListNode dummyHead = new ListNode();
////        dummyHead.next = head;
////        ListNode p = dummyHead;
////        int t = 0;
////        while(p.next!=null){
////            t++;
////
////            if(t==n+1){
////                p.next=p.next.next;
////            }
////            p = p.next;
////        }
////    }
////    public ListNode removeNthFromEnd(ListNode head, int n) {
////        int t = count(head);
//////        System.out.println(n);
//////        System.out.println(t);
////        removeNode(t-n,head);
////        return head;
////    }
////}
//
//
//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode dummy = new ListNode(0, head);
//        ListNode first = head;
//        ListNode second = dummy;
//        for (int i = 0; i < n; ++i) {
//            first = first.next;
//        }
//        while (first != null) {
//            first = first.next;
//            second = second.next;
//        }
//        second.next = second.next.next;
//        ListNode ans = dummy.next;
//        return ans;
//    }
//}
