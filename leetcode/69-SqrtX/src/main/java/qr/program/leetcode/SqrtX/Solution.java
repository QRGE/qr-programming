package qr.program.leetcode.SqrtX;

/**
 * @see <a href="https://leetcode-cn.com/problems/sqrtx/submissions/">x的平方根</a>
 * @author qr
 * @date 2022/4/24 21:37
 */
public class Solution {

    public int mySqrt(int x) {
        long left = 0, right = x, ans = 0;
        while (left <= right) {
            long mid = (right - left) / 2 + left;
            if (mid * mid <= x) {
                // 得保存一下 +1 前的 mid
                ans = mid;
                left = mid + 1;
            }else  {
                right = mid - 1;
            }
        }
        return (int)ans;
    }
}
