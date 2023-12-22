package com.zsh.动态规划.leetcode;

/**
 * @version v1.0
 * @ClassName: Solution53
 * @Description:
 * @Author: 赵思豪
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int maxIndex = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxIndex = Math.max(nums[i], maxIndex + nums[i]);
            max = Math.max(max, maxIndex);
        }
        return max;
    }
}
