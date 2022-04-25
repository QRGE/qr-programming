package qr.program.leetcode.ArrangingCoins;

/**
 * @see <a href="https://leetcode-cn.com/problems/arranging-coins/">排列硬币</a>
 * @author qr
 * @date 2022/4/25 09:59
 */
public class Solution {

    /**
     * 思路等同于用 二分查找 找最大的小于等于 k 的数
     */
    public int arrangeCoins(int n) {
        long left = 0, right = n, ans = 0;
        while (left <= right) {
            long mid = (right - left) / 2 + left;
            // n * (a1 + an) * d / 2
            // 最大的小于等于
            if (mid * (mid + 1) / 2 <= n) {
                ans = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return (int)ans;
    }
}
