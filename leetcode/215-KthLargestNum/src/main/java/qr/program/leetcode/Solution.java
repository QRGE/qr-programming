package qr.program.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 选择排序：只需要排序k个元素即可
 * @Author qr
 * @Date 2022/5/7-16:42
 */
@SuppressWarnings("all")
public class Solution {

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(new Solution().findKthLargest(nums, 3));
    }

    public int findKthLargest2(int[] nums, int k) {
        int maxIndex;
        // 执行 k 次选择
        for (int i = 0; i < k; i++) {
            maxIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[maxIndex] < nums[j]) {
                    // 记录最大值的下标
                    maxIndex = j;
                }
            }
            // 将最大元素交换至首位
            swap(nums, i, maxIndex);
        }
        return nums[k - 1];
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
