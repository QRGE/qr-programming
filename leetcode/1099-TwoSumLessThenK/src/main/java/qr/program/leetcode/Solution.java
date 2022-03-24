package qr.program.leetcode;

/**
 * @see <a href="https://leetcode-cn.com/problems/two-sum-less-than-k/"> 小于 K 的两数之和 </a>
 * @author qr
 * @date 2022/3/24 18:16
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().twoSumLessThanK(new int[]{34, 23, 1, 24, 75, 33, 54, 8}, 60));
    }

    public int twoSumLessThanK(int[] nums, int k) {
        int sum = -1;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int temp = nums[i] + nums[j];
                if (temp < k && temp > sum) {
                    sum = temp;
                }
            }
        }
        return sum;
    }
}
