import java.util.logging.Level;

/**
 * @see <a href="https://leetcode-cn.com/problems/reverse-linked-list/solution/"> 反转链表 </a>
 * @author qr
 * @date 2022/3/30 20:16
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        // 前驱节点, 一开始为null
        ListNode prev = null;
        // 当前节点
        ListNode cur = head;
        while (cur != null) {
            // 保存后继承节点
            ListNode next = cur.next;
            // 当前节点指向前驱节点
            cur.next = prev;
            // 前驱节点移动
            prev = cur;
            // 循环
            cur = next;
        }
        return prev;
    }

    public ListNode reverseListByRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseListByRecursion(head);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
