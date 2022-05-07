package qr.program.leetcode;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode-cn.com/problems/move-zeroes/">移动零</a>
 * @Author qr
 * @Date 2022/5/7-15:29
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {0,0,1};
        new Solution().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 左指针指向当前已经处理好的序列的尾部，右指针指向待处理序列的头部。
     */
    public void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void moveZeros2(int[] nums) {
        int indexNow = 0;
        int indexNum = 0;
        int m = nums.length;

        while(indexNum < m){
            if(nums[indexNum] != 0) {
                nums[indexNow++] = nums[indexNum];
            }
            ++indexNum;
        }

        for(int i = indexNow; i < m; i++){
            nums[i] = 0;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
