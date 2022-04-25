package qr.program.leetcode.searchRange;

/**
 * @see <a href="https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/">在排序数组中查找元素的第一个和最后一个位置</a>
 * @author qr
 * @date 2022/4/25 10:15
 */
public class Solution {

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1,-1};
        int[] result = new int[]{-1, -1};
        int index1 = binarySearch1(nums, target);
        if (nums[index1] == target) {
            result[0] = index1;
        }
        int index2 = binarySearch2(nums, target);
        if (nums[index2] == target) {
            result[1] = index2;
        }else {
            result[1] = result[0];
        }
        return result;
    }

    /**
     * 找到最大的 <= target 数
     */
    private int binarySearch1(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = 0;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] >= target) {
                ans = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private int binarySearch2(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = 0;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] <= target) {
                ans = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
