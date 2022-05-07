package qr.program.leetcode;

/**
 * @see <a href="https://leetcode-cn.com/problems/largest-number/">最大数</a>
 * @Author qr
 * @Date 2022/5/4-14:55
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        String number = new Solution().minNumber(nums);
        System.out.println(number);
    }

    public String minNumber(int[] nums) {
        StringBuilder s = new StringBuilder();
        String[] str = new String[nums.length];
        //将整型数组转化为字符串数组
        for(int i=0;i<nums.length;i++)
            str[i] = String.valueOf(nums[i]);
        sort(str,0,nums.length-1);
        if(str[nums.length-1].equals("0")){
            return "0";
        }
        // 组成返回值
        for(int i=str.length-1;i>=0;i--)
            s.append(str[i]);
        return s.toString();
    }

    /**
     * 按照定义的规则从小到大排序
     */
    public void sort(String[] str,int left,int right) {
        if(left >= right) return;
        int i = left;
        int j = right;
        //以left作为标记，快速排序找到str[left]的真正位置
        while(i < j) {
            while((str[j]+str[left]).compareTo(str[left]+str[j]) >= 0 && i<j) j--;
            while((str[i]+str[left]).compareTo(str[left]+str[i]) <= 0 && i<j) i++;
            swap(str,i,j);
        }
        //分治的思想找到其他的位置
        swap(str,left,i);
        sort(str,left,i-1);
        sort(str,i+1,right);
    }

    public void swap(String[] str, int i, int j){
        String temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
