package qr.program.leetcode.megerIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author qr
 * @Date 2022/5/15-15:45
 */
public class Solution {

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        intervals = new Solution().merge(intervals);
        System.out.println(Arrays.deepToString(intervals));
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        // 数组按照区间左端点升序排序
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        // 保存合并后的区间
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            int L = interval[0], R = interval[1];
            if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < L) {
                merged.add(new int[]{L, R});
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], R);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
