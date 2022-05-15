package qr.program.leetcode;

import qr.program.leetcode.basic.ListNode;

/**
 * @see <a href="https://leetcode-cn.com/leetbook/read/sort-algorithms/euvypr/">对链表进行插入排序</a>
 * @Author qr
 * @Date 2022/5/7-18:31
 */
public class Solution {

    public ListNode insertionSortList(ListNode head) {
        // 校验
        if (head == null) {
            return null;
        }
        // 用于保存 head 且进行返回
        ListNode dummyHead = new ListNode(0, head);
        // lastSorted 保存顺序排列的最后一个节点
        // curr 保存乱序节点的第一个节点
        ListNode lastSorted = head, curr = head.next;
        while (curr != null) {
            if (lastSorted.val <= curr.val) {
                lastSorted = lastSorted.next;
            } else {
                // 找到需要交换节点的位置
                ListNode prev = dummyHead;
                while (prev.next.val <= curr.val) {
                    prev = prev.next;
                }
                // 进行节点交换
                lastSorted.next = curr.next;
                curr.next = prev.next;
                prev.next = curr;
            }
            curr = lastSorted.next;
        }
        return dummyHead.next;
    }
}
