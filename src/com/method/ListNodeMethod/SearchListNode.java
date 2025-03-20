package com.method.ListNodeMethod;

import com.entity.ListNode;

public class SearchListNode {
    public static void search(ListNode head){
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
