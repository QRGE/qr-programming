package qr.program.leetcode;

import qr.program.leetcode.basic.ListNode;

import java.util.HashSet;

/**
 * @see <a href="https://leetcode-cn.com/problems/linked-list-cycle/"> 环形链表 </a>
 * @author qr
 * @date 2022/3/30 21:22
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        return hasCycle1(head);
    }

    /**
     * 快慢指针
     */
    public static boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * 借助set记录
     */
    public static boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        HashSet<ListNode> set = new HashSet<>();
        while (head.next != null) {
            if (set.contains(head)) {
                return true;
            }else {
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
