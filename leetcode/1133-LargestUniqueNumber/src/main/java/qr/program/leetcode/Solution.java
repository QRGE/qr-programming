package qr.program.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode-cn.com/problems/largest-unique-number/"> 最大唯一数 </a>
 * @Author qr
 * @Date 2022/5/4-14:21
 */
@SuppressWarnings("unused")
public class Solution {

    public static void main(String[] args) {
        int[] nums = {5,7,3,9,4,9,8,3,1};
        int target = new Solution().largestUniqueNumber2(nums);
        System.out.println(target);
    }

    /**
     * 借助哈希表再遍历 value=1 的值
     */
    public int largestUniqueNumber2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            Integer count = map.getOrDefault(num, 0);
            map.put(num, ++count);
        }
        int target = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                target = Math.max(entry.getKey(), target);
            }
        }
        return target;
    }

    /**
     * 计数排序思想
     */
    public int largestUniqueNumber(int[] nums) {
        if (nums == null) return -1;
        int[] countArr = new int[1001];
        for (int num : nums) {
            countArr[num]++;
        }
        int target = -1;
        for (int i = countArr.length-1; i > 0 ; i--) {
            if (countArr[i] == 1) {
                target = i;
                break;
            }
        }
        return target;
    }
}
