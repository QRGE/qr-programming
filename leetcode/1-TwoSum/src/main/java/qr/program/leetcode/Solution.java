package qr.program.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @see <a href="https://leetcode-cn.com/problems/two-sum/"> 1. 两数之和 </a>
 */
class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum2(new int[]{1, 2, 4, 7}, 3)));
    }

    public int[] twoSum(int[] nums, int target) {
        return twoSum2(nums, target);
    }

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            Integer b = map.get(a);
            if (b != null) {
                return new int[]{i, b};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}