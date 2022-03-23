package qr.program.leetcode;

/**
 * @see <a href="https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/"> 两数之和II </a>
 * @author qr
 * @date 2022/3/23 23:15
 */
@SuppressWarnings("unused")
public class Solution {

    /**
     * 双指针
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            }else if (sum < target) {
                left++;
            }else {
                // 注意题目要求下标是从 1 开始
                return new int[]{left+1, right+1};
            }
        }
        return null;
    }

    /**
     * 二分法, 不过感觉怪怪的🤔
     */
    public int[] twoSum2(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; ++i) {
            int low = i + 1, high = numbers.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] > target - numbers[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return null;
    }
}
