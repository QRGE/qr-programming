package qr.program.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * @Author qr
 * @Date 2022/5/7-15:02
 */
public class Solution {

    public String minNumber(int[] nums) {
        sort(nums);
        StringJoiner joiner = new StringJoiner("");
        for (int num : nums) {
            joiner.add(num == 0 ? "" : num+"");
        }
        return joiner.toString();
    }

    private void sort(int[] nums) {
        boolean swapped = true;
        int lastIndexOfUnsortedElement = nums.length - 1;
        int index= -1;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < lastIndexOfUnsortedElement; i++) {
                if (("" + nums[i] + nums[i+1]).compareTo("" + nums[i+1] + nums[i]) > 0) {
                    swap(i, i+1, nums);
                    swapped = true;
                    index = i;
                }
            }
            lastIndexOfUnsortedElement = index;
        }
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
