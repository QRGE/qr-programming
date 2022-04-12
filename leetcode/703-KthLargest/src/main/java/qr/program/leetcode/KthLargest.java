package qr.program.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

@SuppressWarnings("all")
public class KthLargest {

    /**
     * java 的优先队列默认为最小堆
     */
    private Queue<Integer> kList;
    private int k;

    public KthLargest(int k, int[] nums) {
        kList = new PriorityQueue<>();
        this.k = k;
        for (int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        kList.offer(val);
        if (kList.size() > k) {
            kList.poll();
        }
        return kList.peek();
    }
}