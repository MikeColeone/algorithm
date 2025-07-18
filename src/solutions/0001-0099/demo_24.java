//package com.method;
//import com.entity.ListNode;
//public class demo_24 {
//}
//
////双指针
//class Solution {
//    public ListNode swapPairs(ListNode head) {
//        //创建虚拟头节点
//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next = head;
//        //创建当前节点
//        ListNode cur = dummyHead;
//        //保证有两个节点及以上
//        while(cur.next!=null&&cur.next.next!=null){
//            //定义到函数体内 减少不必要的内存占用
//            ListNode slow=cur.next,fast = cur.next.next;
//            //交换节点
//            //创建中间节点
//            slow.next = fast.next;
//            fast.next = slow;
//            cur.next=fast;
//
//            //移动当前节点
//            cur = slow;
//        }
//        return dummyHead.next;
//    }
//}
//
////递归
