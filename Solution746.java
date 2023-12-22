package com.zsh.动态规划.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @version v1.0
 * @ClassName: Solution746
 * @Description:
 * @Author: 赵思豪
 */
public class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Integer.min(dp[i - 1], dp[i - 2]) + cost[i];
            print(dp);
        }
        return Integer.min(dp[dp.length-1],dp[dp.length-2]);
    }
    private void print(int[] dp){
        System.out.println(Arrays.toString(dp));
    }
    @Test
    public void test(){
        int [] cost = {1,100,1,1,1,100,1,1,100,1};
        minCostClimbingStairs(cost);
    }
}
