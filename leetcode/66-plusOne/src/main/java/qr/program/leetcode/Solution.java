package qr.program.leetcode;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @see <a href="https://leetcode-cn.com/problems/plus-one/"> 加一 </a>
 * @author qr
 * @date 2022/3/25 22:49
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));
    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            if (digits[i] != 9) {
                ++digits[i];
                for (int j = i + 1; j < n; ++j) {
                    digits[j] = 0;
                }
                return digits;
            }
        }

        // digits 中所有的元素均为 9
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
}
