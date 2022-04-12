package qr.program.leetcode;

import java.util.LinkedList;

/**
 * @author qr
 * @date 2022/3/31 22:45
 */
public class MyStack {

    private LinkedList<Integer> queue;

    private LinkedList<Integer> queueSupport;

    public MyStack() {
        queue = new LinkedList<>();
        queueSupport = new LinkedList<>();
    }

    public void push(int x) {
        queueSupport.offer(x);
        while (!queue.isEmpty()) {
            queueSupport.offer(queue.poll());
        }
        LinkedList<Integer> temp = queueSupport;
        queueSupport = queue;
        queue = temp;
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
