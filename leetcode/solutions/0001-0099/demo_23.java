//package com.method;
//import com.entity.*;
//
//public class demo_23 {
//    public static void main(String[] args) {
//
//    }
//}
//
////直接遍历整个数组很难处理当出现相同数值的节点后移的问题
////两个两个处理，同时注意该题不去重
////没有插入删除操作不需要建立虚拟头节点，直接遍历比较就可以
//class Solution {
//    public ListNode mergeKLists(ListNode[] lists) {
//    return merge(lists,0,lists.length-1);
//    }
//
//
//    public ListNode merge(ListNode[] lists,int a,int b){
//        int mid = (a+b)>>1;
//        if(a==b) return lists[a];
//        return a>b?null:mergeLists(merge(lists,a,mid),merge(lists,mid+1,b));
//    }
//
//
//    public ListNode mergeLists(ListNode l1, ListNode l2) {
//        //首先判空
//        if (l1 == null || l2 == null) {
//            return l1 != null ? l1 : l2;
//        }
//        ListNode head = new ListNode(0);
//        ListNode p = head, aPtr = l1, bPtr = l2;
//        while (aPtr != null && bPtr != null) {
//            if (aPtr.val < bPtr.val) {
//                p.next = aPtr;
//                aPtr = aPtr.next;
//            } else {
//                p.next = bPtr;
//                bPtr = bPtr.next;
//            }
//            p = p.next;
//        }
//        p.next = (aPtr != null ? aPtr : bPtr);
//        return head.next;
//    }
//}
