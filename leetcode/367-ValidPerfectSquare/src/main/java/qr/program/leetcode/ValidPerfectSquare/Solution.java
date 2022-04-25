package qr.program.leetcode.ValidPerfectSquare;

/**
 * @see <a href="https://leetcode-cn.com/problems/valid-perfect-square/">有效的完全平方数</a>
 * @author qr
 * @date 2022/4/25 09:41
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().isPerfectSquare(16));
    }

    public boolean isPerfectSquare(int num) {
        long left = 0, right = num, ans = 0;
        while (left <= right) {
            long mid = (right - left) / 2 + left;
            if (mid * mid <= num) {
                ans = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return ans * ans == num;
    }
}
