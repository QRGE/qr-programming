package qr.program.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 选择排序：只需要排序k个元素即可
 * @Author qr
 * @Date 2022/5/7-16:42
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(new Solution().findKthLargest(nums, 3));
    }

    /**
     * 借助小顶堆保存 nums 中前 k 大的数，然后 peek 一下就可以
     */
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(k);
        for (int num : nums) {
            Integer top = queue.peek();
            if (queue.size() <= k || top == null || num > top)
                queue.add(num);
            if (queue.size() > k)
                queue.remove();
        }
        System.out.println(queue);
        return queue.peek() == null ? -1 : queue.peek();
    }
}
