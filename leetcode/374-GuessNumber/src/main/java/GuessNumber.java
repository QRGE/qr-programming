/**
 * @see <a href="https://leetcode.cn/problems/guess-number-higher-or-lower/">猜数字的大小</a>
 * @Author qr
 * @Date 2022/5/20-12:08
 */
public class GuessNumber {

    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) <= 0) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        // 此时有 left == right，区间缩为一个点，即为答案
        return left;
    }

    public int guess(int n) {
        return 0;
    }

}
