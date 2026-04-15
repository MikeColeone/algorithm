//public class demo_0205 {
//
//}
//
//
//
//
// class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
//  }
//
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode cur = new ListNode(); // 创建结点存储每一个位数的值
//        ListNode head = cur;
//        int carry = 0; // 存储进位数
//        while (l1 != null || l2 != null) { // 当l1或着不为空时进入循环，因为要保证遍历所有节点
//            int x = l1 != null ? l1.val : 0; //当进入循环时存在某条链表为空的情况所以要进行判读，当为空时赋值为零，等价于该位置对应数值为0
//            int y = l2 != null ? l2.val : 0;
//            int sum = x + y + carry; //注意加上carry进位数
//            if (sum >= 10)
//                carry = 1;
//            else
//                carry = 0;
//            sum %= 10;
//            //System.out.println(sum);
//            cur.next = new ListNode(sum);
//            cur = cur.next; //后移动结点
//            cur.next = null;
//            if (l1 != null)
//                l1 = l1.next;
//            if (l2 != null) {
//                l2 = l2.next;
//            }
//        }
//        //循环结束时l1,l2两个链表一定遍历完成，唯一需要确定的就是有没有进位再最后一位
//        if(carry == 1) //两个位置上数相加一定小于20
//        {
//            //为cur申请新节点
//            cur.next = new ListNode(1);
//
//        }
//        return head.next;
//    }
//}