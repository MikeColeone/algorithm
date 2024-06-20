//import java.util.Scanner;
//public class demo_203 {
//
//}
//
//class ListNode{
//    public int val;
//    public ListNode next;
//
//    public ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//
//    public ListNode(int val){
//        this.val = val;
//    }
//
//    //创建链表（不包含头节点）
//    public ListNode createList(ListNode head,int n){
//        Scanner input = new Scanner(System.in);
//        for (int i = 1;i<n;i++){
//            int t = input.nextInt();
//            ListNode p = new ListNode(t);
//            head.next = p;
//            head=head.next;
//        }
//        head.next = null;
//
//
//        return head;
//    }
//
//}
//
//
//
//class Solution {
//    public ListNode removeElements(ListNode head, int val) {
//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next = head;
//        ListNode temp = dummyHead;
//        while (temp.next != null) {
//            if (temp.next.val == val) {
//                temp.next = temp.next.next;
//            } else {
//                temp = temp.next;
//            }
//        }
//        return dummyHead.next;
//    }
//}