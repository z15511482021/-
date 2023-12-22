package com.zsh.动态规划.leetcode;

import java.util.Arrays;

/**
 * @version v1.0
 * @ClassName: Solution16
 * @Description:
 * @Author: 赵思豪
 */
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[i]+ nums[left] + nums[right];
                if(Math.abs(sum - target) < Math.abs(res - target)){
                    res = sum;
                }
                if(sum < target){
                    left++;
                }else if(sum > target){
                    right--;
                }else{
                    return sum;
                }
            }
        }
        return res;
    }
}
