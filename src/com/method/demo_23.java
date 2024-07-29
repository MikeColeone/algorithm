package src.com.method;
import src.com.entity.*;
public class demo_23 {
}
class Solution {

//    顺序插入新建立的数组 除了建立辅助头节点没有产生新的空间
//    public ListNode mergeKLists(ListNode[] lists) {
//        ListNode head = null;
//        for (ListNode list : lists) {
//            head = mergeTwo(head, list);
//        }
//        return head;
//    }

    //分治合并算法
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    public ListNode merge(ListNode[] lists,int l,int r) {
        if (l == r) return lists[l]; //当l==r表示只有一个链表，返回即可
        if(l>r) return null; //当了》r是表示不存在返回空
        int mid = (l+r)>>1; //实现除以二的操作
        return mergeTwo(merge(lists,l,mid),merge(lists,mid+1,r)); //合并链表


    }

    public ListNode mergeTwo(ListNode l1,ListNode l2){
        if(l1==null||l2==null){
            return l1==null?l2:l1;
        }
        ListNode ans = new ListNode(0);
        ListNode p = ans,l1ptr = l1,l2ptr=l2;
        while (l1ptr!=null&&l2ptr!=null){
            if(l1ptr.val < l2ptr.val){
                p.next = l1ptr;
                l1ptr = l1ptr.next;
            }
            else{
                p.next = l2ptr;
                l2ptr = l2ptr.next;
            }
            p = p.next;
        }
        p.next =(l1ptr!=null?l1ptr:l2ptr);
        return ans.next;
    }
}