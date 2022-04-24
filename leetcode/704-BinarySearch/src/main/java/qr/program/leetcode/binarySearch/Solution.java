package qr.program.leetcode.binarySearch;

/**
 * @see <a href="https://leetcode-cn.com/problems/binary-search/submissions/"> 二分查找 </a>
 * @author qr
 * @date 2022/4/24 17:32
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9 ,12};
        int target = 9;
        System.out.println(new Solution().search(nums, target));
    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
