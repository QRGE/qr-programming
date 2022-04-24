package qr.program.leetcode;

/**
 * @author qr
 * @date 2022/4/24 18:16
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int targetIndex = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                // 通过二分法不断缩小，保存一下最接近，即最 target 的数，即大于等于 target 的最小值
                targetIndex = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return targetIndex;
    }
}
