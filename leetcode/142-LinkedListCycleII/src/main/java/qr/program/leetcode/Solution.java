package qr.program.leetcode;

import qr.program.leetcode.basic.ListNode;

import java.util.HashSet;

/**
 * @author qr
 * @date 2022/3/30 22:21
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        return detectCycle1(head);
    }

    public static ListNode detectCycle2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                // 查询环的头
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }

    /**
     * 借助set
     */
    public static ListNode detectCycle1(ListNode head) {
        if (head == null) {
            return null;
        }
        HashSet<ListNode> nodes = new HashSet<>();
        while (head.next != null) {
            if (nodes.contains(head)) {
                return head;
            }else {
                nodes.add(head);
            }
            head = head.next;
        }
        return null;
    }
}
