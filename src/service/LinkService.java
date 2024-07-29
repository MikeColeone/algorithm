package service;
import com.entity.ListNode;
public class LinkService {

    //创建链表
    //头插法 (建立头节点)
    public static ListNode createLinkList(ListNode head) {

    }


    //不建立头节点
    //存在头节点
    public static void printLinkList(ListNode head) {
        ListNode p = head;
        while(p.next!=null){
            System.out.println(p.val);
        }
    }

    //不存在头节点
    public static void printLinkListNoHead(ListNode head) {
        ListNode dummyHead = null;
        dummyHead.next = head;
        ListNode p = dummyHead;
        printLinkListNoHead(p);
    }
}
