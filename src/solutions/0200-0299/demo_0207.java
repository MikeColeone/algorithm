//public class demo_0207 {
//    public static void main(String[] args) {
//
//    }
//}
//
//public class ListNode {
//  int val;
//  ListNode next;
//  ListNode(int x) {
//      val = x;
//      next = null;
//  }
//}
//
//public class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode A = headA;
//        ListNode B = headB;
//        if(A==null||B==null) return null;
//        int lengthA = 0;
//        int lengthB = 0;
//        while (A!=null){
//            A=A.next;
//            lengthA++;
//        }
//        while (B!=null){
//            B=B.next;
//            lengthB++;
//        }
//        B = headB;
//        A=headA;
//        if(lengthA>lengthB){
//            int t = lengthA-lengthB;
//
//            while (t!=0){
//                t--;
//                A=A.next;
//            }
//            while (A!=null){
//                if(A == B) return A;
//                A = A.next;
//                B = B.next;
//            }
//            return null;
//        }
//        else if(lengthB>lengthA){
//
//            int t = lengthB-lengthA;
//            while (t!=0){
//                t--;
//                B=B.next;
//            }
//            while (A!=null){
//                if(A == B) return A;
//                A = A.next;
//                B = B.next;
//            }
//            return null;
//        }
//        else{
//            while (A!=null){
//                if(A == B) return A;
//                A = A.next;
//                B = B.next;
//            }
//            return null;
//        }
//
//
//
//    }
//}