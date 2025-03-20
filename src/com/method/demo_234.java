package com.method;

import com.entity.ListNode;
/*回文链表*/
public class demo_234 {
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


/*反转字符串方法*/
//class Solution {
//    public boolean isPalindrome(ListNode head) {
//
//        StringBuilder temp = new StringBuilder();
//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next = head;
//        ListNode p = dummyHead;
//        while (p.next != null) {
//            temp.append(p.next.val);
//            p = p.next;
//        }
//        System.out.println(temp);
//        //判断回文字符串
//        return temp.toString().equals(temp.reverse().toString());
//    }
//
//}

/*反转链表*/
    /*100% 69%*/
class Solution {
    public boolean isPalindrome(ListNode head) {

//        StringBuilder temp = new StringBuilder();
//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next = head;
//        ListNode p = dummyHead;
        ListNode head1 = reverseList(head);
        return judge(head,head1);

    }
//反转链表
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;// 保存下一个节点
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

//    链表对比
    public boolean judge(ListNode h1,ListNode h2){
        ListNode p1 = h1;
        ListNode p2 = h2;
        while (p1 != null && p2 != null) {
            if(p1.val != p2.val)return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1 == null && p2 == null;
    }
}