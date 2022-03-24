package qr.program.leetcode;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode-cn.com/problems/image-smoother/"> 图片平滑器 </a>
 * @author qr
 * @date 2022/3/24 12:53
 */
public class Solution {

    public static void main(String[] args) {
        int[][] img = new int[][]{{1,1,1}, {1,0,1}, {1,1,1}};
        int[][] imgAfterSmooth = new Solution().imageSmoother(img);
        System.out.println(Arrays.deepToString(imgAfterSmooth));
    }

    /**
     * a b c
     * d e f
     * g h i
     */
    public int[][] imageSmoother(int[][] img) {
        // 获取长宽
        int imageLong = img[0].length;
        int imageWidth = img.length;
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                // e
                int sum = img[i][j];
                int count = 1;
                // b
                if (i - 1 >= 0) {
                    sum += img[i-1][j];
                    count ++;
                }
                // h
                if (i + 1 < imageWidth) {
                    sum += img[i+1][j];
                    count++;
                }
                // a
                if (i - 1 >= 0 && j - 1 >= 0) {
                    sum += img[i-1][j+1];
                    count++;
                }
                // d
                if (j - 1 >= 0) {
                    sum += img[i-1][j-1];
                    count++;
                }
                // f
                if (i + 1 < imageLong) {
                    sum += img[i+1][j];
                    count++;
                }
                // i
                if (i + 1 < imageWidth && j + 1 < imageLong) {
                    sum += img[i+1][j+1];
                    count++;
                }
                // g
                if (i + 1 < imageWidth && j - 1 >= 0 ) {
                    sum += img[i-1][j-1];
                    count++;
                }
                // c
                if (i - 1 >= 0 && j + 1 < imageLong) {
                    sum += img[i][j+1];
                    count++;
                }
                img[i][j] = sum / count;
            }
        }
        return img;
    }
}
