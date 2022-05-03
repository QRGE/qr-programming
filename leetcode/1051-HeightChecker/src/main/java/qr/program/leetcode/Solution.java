package qr.program.leetcode;

import java.util.Arrays;
import java.util.Collections;

/**
 * @see <a href="https://leetcode-cn.com/problems/height-checker/">高度检查器</a>
 * @Author qr
 * @Date 2022/5/4-00:43
 */
public class Solution {

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        int count = new Solution().heightCheck3(heights);
        System.out.println(count);
    }

    public int heightCheck3(int[] heights) {
        if (heights == null || heights.length <= 1) {
            return 0;
        }
        int max = heights[0];
        // 找到最大值
        for (int height : heights)
            if (height > max) max = height;
        // 累计数组
        int[] arr = new int[max+1];
        for (int height : heights) {
            arr[height]++;
        }
        int count = 0;
        for (int i = 1, j = 0; i < arr.length; i++) {
            // arr[i]，i就是桶中存放的元素的值，arr[i]是元素的个数
            // arr[i]-- 就是每次取出一个，一直取到没有元素，成为空桶
            // 如果序列是顺序排序，取出桶中的数，如果桶里有数，则桶的元素值应该和从heights中取出顺序的元素值相等，不想等则 count++
            while (arr[i]-- > 0) {
                // 从桶中取出元素时，元素的排列顺序就是非递减的，然后与heights中的元素比较，如果不同，计算器就加1
                if (heights[j++] != i) count++;
            }
        }
        return count;
    }

    public int heightCheck2(int[] heights) {
        if (heights == null || heights.length <= 1) {
            return 0;
        }
        int [] backup = new int[heights.length];
        System.arraycopy(heights, 0, backup, 0, heights.length);
        backup = Arrays.stream(backup).sorted().toArray();
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != backup[i]) count++;
        }
        return count;
    }

    public int heightChecker(int[] heights) {
        if (heights == null || heights.length <= 1) {
            return 0;
        }
        int [] backup = new int[heights.length];
        System.arraycopy(heights, 0, backup, 0, heights.length);
        int begin = 0;
        int end = heights.length;
        sort(backup, begin, end);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (backup[i] != heights[i]) count++;
        }
        return count;
    }

    private void sort(int[] array, int begin, int end) {
        if (begin >= end) return;
        // 将 array 分成两个自组，左子序 arr1，右子序 arr2
        int standard = partition(array, begin, end);
        // 让 arr1 有序
        sort(array, begin, --standard);
        // 让 arr2 有序
        sort(array, ++standard, end);
    }

    private int partition(int[] array, int begin, int end) {
        int boundary = array[begin];
        int left = begin;
        int right = end;
        while (true) {
            // 找到第一个比 boundary 小的数
            while (cmp(boundary, array[--right]) > 0)
                if (right == begin) break;
            // 从左往右找到第一个比 boundary 大的数
            while (cmp(boundary, array[++left]) < 0)
                if (left == end) break;
            if (left >= right) {
                break;
            }else {
                swap(array, left, right);
            }
        }
        swap(array, begin, left);
        return left;
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    private int cmp (int a, int b) {
        return Integer.compare(a, b);
    }


}
