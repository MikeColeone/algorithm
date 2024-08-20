package com.method;

import com.entity.*;

import java.util.HashMap;
import java.util.Map;

public class demo_138 {
}


//之前想着存储序号 然后遍历第二个链表 找到对应的位置 突然发现可以通过映射关系直接定位到新节点 p的random获取到 其键值就是q.random
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node dummyHead = new Node(0);
        Node p = head;
        Node q = dummyHead;
        Map<Node, Node> map = new HashMap<>();
        while (p != null) {
            Node newNode = new Node(p.val);
            q.next = newNode;
            map.put(p, newNode);
            p = p.next;
            q = q.next;
        }
        p = head;
        q = dummyHead.next;
        while (p != null) {
            if (p.random != null) {
                q.random = map.get(p.random);
            }
            //这里不需要在判断为空的情况 （注意构造函数的初值）
            p = p.next;
            q = q.next;
        }

        // 返回新链表的头节点
        return dummyHead.next;
    }
}
