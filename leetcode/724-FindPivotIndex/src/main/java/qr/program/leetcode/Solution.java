package qr.program.leetcode;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] nums = {-1,-1,0,1,1,0};
        int index = new Solution().pivotIndex(nums);
        System.out.println(index);
    }

    // 2×sum + numI = total
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }

}